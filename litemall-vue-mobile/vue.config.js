const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
    transpileDependencies: true,
    chainWebpack: config => {
        config.plugin('html').tap(args => {
            args[0].title = '仿小米有品'
            return args
        })
    },
    devServer: {
        port: 8020, // 本机端口
        proxy: {
            '/mobile/': {
                target: 'http://localhost:9020', // 目标路径
                changeOrigin: true, // 是否跨域
                pathRewrite: {
                    '^/mobile': '' // 重写路径 比如/mobile/xxx 会被替代成/xxx
                }
            }
        }
    }
})
