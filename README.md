# CriminalIntent
## Приложение на android книга Андроид программирование для профессионалов 2-е издание
#### Приложение, построенное по схеме MVC, которое использует фрагменты, взаимодействует с другими приложениями, делает снимки и сохраняет данные.
Оно предназначено для хранения информации об «офисных преступлениях»: грязной посуде, оставленной в раковине, или пустом лотке общего принтера после печати документов.
В приложении CriminalIntent пользователь создает запись о преступлении с заголовком, датой и фотографией. Также можно выбрать подозреваемого в списке контактов и отправить жалобу по электронной почте, опубликовать ее в Twitter, Facebook или другом приложении.

#### На главном экране представлен список преступлений, реализованный с помощью RecyclerView. В панеле инструментов можно добавить новое преступление.

![Image alt](https://github.com/TishkevichLeonid/CriminalIntent/raw/master/screenshots/RecyclerView1.jpg)

#### На экране преступления можно заполнить информацию, добавить фото, поставить дату и время, выбрать подозреваемого из списка контактов и отправить отчет в социальные сети.

![Image alt](https://github.com/TishkevichLeonid/CriminalIntent/raw/master/screenshots/Crime.jpg)

#### Доступно полное фото инцедента, реализовано через DialogFragment

![Image alt](https://github.com/TishkevichLeonid/CriminalIntent/raw/master/screenshots/ImageDialog.jpg)

#### Выбор даты и времени осуществляется с помощью DatePicker и TimePicker

![Image alt](https://github.com/TishkevichLeonid/CriminalIntent/raw/master/screenshots/DatePicker.jpg) ![Image alt](https://github.com/TishkevichLeonid/CriminalIntent/raw/master/screenshots/TimePicker.jpg)

#### Преступления можно листать не перемещаясь на экран списка преступлений

![Image alt](https://github.com/TishkevichLeonid/CriminalIntent/raw/master/screenshots/ViewPager.png)

Данные о преступлениях хранятся в базе данный SQLite, фотографии преступлений находятся во внешнем хранилище.
