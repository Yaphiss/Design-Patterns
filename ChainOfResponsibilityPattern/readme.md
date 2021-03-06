#### 责任链模式
> 责任链模式指的是为了避免请求者与多个处理者耦合在一起，因此设计为前一个处里者记住下一处里者的引用，从而形成一条处理链；
请求者无需关心具体的处里者以及具体的实现逻辑，当有请求发生时，只需要将任务发送到责任链上即可，它会沿着该链直到有对象处理它为止。

####**优点：**
- 降低了对象之间的耦合度，使得发送者与请求者无需知道对方的具体信息，也无需知道链结构以及具体的处理方式
- 增强了系统的可扩展性。可以根据需要增加新的请求处理类，满足开闭原则.
- 增强了给对象指派职责的灵活性。当工作流程发生变化，可以动态地改变链内的成员或者调动它们的次序，也可动态地新增或者删除责任。
- 责任链简化了对象之间的连接。每个对象只需保持一个指向其后继者的引用，不需保持其他所有处理者的引用，这避免了使用众多的 if 或者 if···else 语句。
- 责任分担。每个类只需要处理自己该处理的工作，不该处理的传递给下一个对象完成，明确各类的责任范围，符合类的单一职责原则。

####**缺点：**
- 无明确的处里者，可能造成到结尾都没有得到处理
- 依赖于客户端的配置，可能由于调用者没有正确配置导致循环调用
- 责任链过长会导致性能下降


####**模式结构：**
- 抽象处里者角色：定义一个处理接口，包含抽象处理方法以及后续链接
- 具体处理者角色：实现抽象处理方法，判断条件是否允许处理，否则将任务移交给后继处里者
- 客户类角色：创建责任链并且提交请求

####**应用场景**
- 有多个对象可以处理一个请求，哪个对象处理该请求由运行时刻自动确定
- 可动态指定一组对象处理请求，或添加新的处理者。
- 在不明确指定请求处理者的情况下，向多个处理者中的一个提交请求。