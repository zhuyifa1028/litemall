module.exports = {
    "root": true,
    "env": {
        "node": true
    },
    "extends": [
        "plugin:vue/vue3-essential",
        "eslint:recommended"
    ],
    "parserOptions": {
        "parser": "@babel/eslint-parser"
    },
    "rules": {
        "quotes": [2, "single", { // 要求尽可能地使用单引号
            "avoidEscape": true, // 允许字符串使用单引号或双引号，只要字符串中包含了一个其它引号，否则需要转义
            "allowTemplateLiterals": true // 允许字符串使用反勾号
        }],
        // 关闭驼峰命名规则
        "vue/multi-word-component-names": 0,
    }
}