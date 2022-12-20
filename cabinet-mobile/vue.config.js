const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
    transpileDependencies: true,
    chainWebpack: config => {
        config.plugin('html').tap(args => {
            args[0].title = '好奇柜'
            return args
        })
    },
    devServer: {
        port: 8092, // 本机端口
        proxy: {
            '/mobile/': {
                target: 'http://localhost:8093', // 目标路径，别忘了加http和端口号
                changeOrigin: true, // 是否跨域
                pathRewrite: {
                    '^/mobile': '' // 重写路径
                    // '^/123': ''  // 比如/123/admin/being/classes/classInfo 会被替代成/admin/being/classes/classInfo
                }
            }
        }
    }
})
