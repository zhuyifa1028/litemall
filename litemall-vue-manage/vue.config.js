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
        port: 8010, // 本机端口
        proxy: {
            '/manage/': {
                target: 'http://localhost:9010', // 目标路径
                changeOrigin: true, // 是否跨域
                pathRewrite: {
                    '^/manage': '' // 重写路径 比如/manage/xxx 会被替代成/xxx
                }
            }
        }
    }
})
