# LabelView
继承 TextView，能够在 TextView 上下左右固定设置文本的 View

![](/demo.png)

以前，我们如果要写出 `我的id: drakeet` 这样的条目内容，需要使用两个 `TextView` 组合，或者一个 `TextView` 然后每次 `setText` 的时候，`setText
("我的id: " + user.id)`, sad...

现在呢，使用 `LabelView` 吧！

### TODO

- [ ] 实现上下左右 text 的样式定义