# dubbo-demo
dubbo对接zipkin参考case


### master分支        为最基础dubbo [消费者] 调用 [生产者] demo


### http2zipkin分支   为dubbo对接zipkin以okHttp方式上报 demo


### kafka2zipkin分支  为dubbo对接zipkin以kafka方式上报 demo（todo:）


#### 操作步骤：
1、启动 zookeeper 
   对应地址： zookeeper://127.0.0.1:2181

2、（如果对接zipkin）启动本地zipkin,
   对应url+端口：   http://localhost:9411

3、启动 dubbo-provider, 
   对应位置为：com.provider.test.ProviderTest 的 main 方法

4、启动 dubbo-consumer, 
   对应位置为：com.consumer.test.ConsumerTest 的 main 方法

5、完成  
   


