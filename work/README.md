# W02

## 任务一
### 类图:
![](https://github.com/jwork-2021/jw02-NJUOYX/tree/master/work/uml/objs.pu)

### 时序图:
![](https://github.com/jwork-2021/jw02-NJUOYX/tree/master/work/uml/timeline.pu)

### example设计理念

* 程序的本质是将色块对象数组进行排序，并且把每一次数组的变化记录下来，写成log文本文件。

#### 控制流程
main函数的控制流程是这样的：首先将```Gourd```类表示的色块对象填充到```Line```类对象(容器)中，之后创建一个排序类```BubbleSorter```，并使得```Geezer```类对象能够通过```Sort```排序接口调用```BubbleSorter```的方法对```Line```类对象进行排序，并得到基础的排序```log```。```Geezer```类对基础排序```log```进行格式化输出，最后```main```函数把```Geezer```输出的格式化文本写入```result.txt```文件中，完成工作。

#### 色块的表示方式
1. 使用```Linable```接口提供外界调用色块方法的唯一方式。该接口要求其实现类能够提供:1.设置对象当前位置，2.得到对象当前位置信息，3.交换两个该同类型对象的位置。
2. ```Gourd```实现了```Linable```接口，在本程序中作为色块对象供操作。```Gourd```类是一个枚举类，提供了7个枚举项，每个项记录了一个24位的rgb色彩信息。有```Position```类成员变量，作为其在待排序数组中的位置的信息，通过这些信息```Gourd```类实现了接口的方法。


#### 排序
1. ```Sort```作为排序功能的接口，```load```方法加载待排序数组，```sort```方法为待排序数组完成排序，```getPlan```方法将在```sort```方法过程中记录下的数组变化日志返回给调用者。
2. ```BubbleSorter```实现了```Sort```接口，使用冒泡排序对数组进行排序，并且在每一次迭代后，将数组元素排列情况记录下来。


#### 控制者(Geezer)
```Geezer```控制着完成了排序功能与色块类容器的交互，通过```Sort```，```Linable```接口得到了色块的排序迭代的过程日志，并且对日志进行格式化，输出。


#### 设计总结
优点： 程序的结构清晰，通过合理设置接口，解耦各个功能部件，使得程序的逻辑结构简洁明了，同时也便于维护和拓展。

缺陷：```Gourd```类和```Position```类存在互相依赖，使得两者之间的耦合度增大，并不利于后续如更改待排序对象形式（例如改成二维数组），需要通过重写代码来实现功能修改。

## 任务二

### 类图
![](https://github.com/jwork-2021/jw02-NJUOYX/tree/master/work/uml/task2.pu)
### 结果演示
![](https://asciinema.org/a/RQXuackROvAQFGHTLxFht8Gn2)

## 任务三

### 类图
![](https://github.com/jwork-2021/jw02-NJUOYX/tree/master/work/uml/task3.pu)
### 结果演示
![](https://asciinema.org/a/5yBg4z8N4TriMCYoiM2ONFX0X)