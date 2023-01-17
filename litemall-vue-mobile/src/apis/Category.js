import request from '@/utils/request'

// 获取分类列表
export function getCategoryList(data) {
    return request({
        url: '/mtop/market/cat/list',
        method: 'post',
        data
    })
}