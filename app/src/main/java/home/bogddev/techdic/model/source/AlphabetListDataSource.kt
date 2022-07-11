package home.bogddev.techdic.model.source

import android.text.SpannableStringBuilder
import android.text.style.UnderlineSpan
import home.bogddev.techdic.model.model.AlphabetListItem
import home.bogddev.techdic.model.model.WordListItem
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject

class AlphabetListDataSource @Inject constructor() {
  private lateinit var initializedList: List<AlphabetListItem>

  suspend fun get(): List<AlphabetListItem> =
    if (this::initializedList.isInitialized)
      initializedList
    else {
      val deferred: Deferred<List<AlphabetListItem>>

      coroutineScope {
        deferred = async {
          listOf(
            AlphabetListItem(
              "A",
              listOf(
                WordListItem(
                  "aerial",
                  "антенна",
                  markUnderlines(
                    "aerial",
                    listOf("антенны"),
                    SpannableStringBuilder(
                      "Disconnect the TV set from mains socket and aerial during lightning storms - Во время грозы отключайте телевизор от розетки электропитания и антенны"
                    )
                  )
                ),
                WordListItem(
                  "accessories",
                  "детали",
                  markUnderlines(
                    "accessories",
                    listOf("детали"),
                    SpannableStringBuilder(
                      "Keep small accessories out of the reach of children - Храните мелкие детали вне досягаемости детей"
                    )
                  )
                ),
                WordListItem(
                  "attachments",
                  "дополнительные аксессуары",
                  markUnderlines(
                    "attachments",
                    listOf("дополнительными аксессуарами"),
                    SpannableStringBuilder(
                      "Use when your hands are wet, with the cabinet removed, or with attachments not recommended by the manufacturer - Касание телевизора мокрыми руками; эксплуатация его со снятым корпусом или с дополнительными аксессуарами, не рекомендованными изготовителем"
                    )
                  )
                ),
                WordListItem(
                  "AC power cord",
                  "шнур питания переменного тока",
                  markUnderlines(
                    "AC power cord",
                    listOf("шнура питания переменного тока"),
                    SpannableStringBuilder(
                      "Make sure that the TV is completely turned off before unplugging the AC power cord - Убедитесь, что телевизор выключен перед отключением шнура питания переменного тока"
                    )
                  )
                ),
                WordListItem(
                  "adjust",
                  "изменять (какие-либо параметры)",
                  markUnderlines(
                    "Adjusts",
                    listOf("изменяет"),
                    SpannableStringBuilder(
                      "Adjusts the sub picture size – изменяет размер субкартинки"
                    )
                  )
                ),
                WordListItem(
                  "adjustment",
                  "регулировка (параметров устройства, прибора)",
                  markUnderlines(
                    "adjustment",
                    listOf("регулировка"),
                    SpannableStringBuilder(
                      "Picture adjustment – Регулировка параметров изображения"
                    )
                  )
                ),
                WordListItem(
                  "adjusting",
                  "регулирование",
                  markUnderlines(
                    "adjusting",
                    listOf("регулировка"),
                    SpannableStringBuilder(
                      "Adjusting the Cooking Time - регулировка времени приготовления"
                    )
                  )
                ),
                WordListItem(
                  "appliance",
                  "прибор",
                  markUnderlines(
                    "appliance",
                    listOf("прибора"),
                    SpannableStringBuilder(
                      "Check if the voltage indicated on the appliance corresponds to local mains voltage before you connect the appliance - Перед подключением прибора убедитесь, что указанное на нем номинальное напряжение соответствует напряжению местной электросети"
                    )
                  )
                ),
                WordListItem(
                  "avoid",
                  "не допускать / избегать",
                  markUnderlines(
                    "avoid",
                    listOf("не допускайте"),
                    SpannableStringBuilder(
                      "If disposable batteries are damaged or leaking, avoid contact with the skin or eye - Если одноразовые батарейки повреждены или протекают, не допускайте их контакта с кожей или глазами"
                    )
                  )
                ),
                WordListItem(
                  "accessories",
                  "принадлежности (дополнительные)",
                  markUnderlines(
                    "accessories",
                    listOf("принадлежности"),
                    SpannableStringBuilder(
                      "Depending on the model that you have purchased, you are supplied with several accessories that can be used in a variety of ways - В зависимости от приобретенной модели в ее комплект входят принадлежности, которые можно использовать различными способами"
                    )
                  )
                ),
                WordListItem(
                  "arcing",
                  "искрение",
                  markUnderlines(
                    "arcing",
                    listOf("искрение"),
                    SpannableStringBuilder(
                      "Arcing can occur if the foil is too close to the oven wall or if too much foil is used - Если фольга находится слишком близко к стенкам печи или ее слишком много, может возникать искрение"
                    )
                  )
                ),
                WordListItem(
                  "Anti-calc cleaning",
                  "противоизвестковая очистка",
                  ""
                ),
                WordListItem(
                  "Approved Service Centre (ASC)",
                  "уполномоченный сервисный центр",
                  markUnderlines(
                    "Approved Service Centre (ASC)",
                    listOf("уполномоченном сервисном центре"),
                    SpannableStringBuilder(
                      "If the electrical cord becomes damaged, it must be immediately replaced by an Approved Service Centre (ASC) to avoid any danger - В случае повреждения электрошнура немедленно замените его в уполномоченном сервисном центре во избежание любого риска"
                    )
                  )
                )
              )
            ),
            AlphabetListItem(
              "B",
              listOf(
                WordListItem(
                  "back cover",
                  "задняя стенка (часть задней стенки корпуса)",
                  markUnderlines(
                    "back cover",
                    listOf("заднюю стенку"),
                    SpannableStringBuilder(
                      "Never remove the back cover of the set as this can expose you to very high voltage and other hazards – Никогда не открывайте заднюю стенку телевизора, поскольку в телевизоре имеются опасное для жизни напряжение и другие источники опасности"
                    )
                  )
                ),
                WordListItem(
                  "broadcast",
                  "программа (теле-, радио-, широковещательная)",
                  markUnderlines(
                    "broadcast",
                    listOf("программы"),
                    SpannableStringBuilder(
                      "Language selection for dual language broadcast – Выбор языка для программы, передаваемой на двух языках"
                    )
                  )
                ),
                WordListItem(
                  "breaker",
                  "автоматический выключатель",
                  markUnderlines(
                    "breaker",
                    listOf("автоматический выключатель"),
                    SpannableStringBuilder(
                      "Have you overloaded the electric circuit and caused a fuse to blow or a breaker to be triggered? - Проверьте, не перегружена ли электрическая цепь, исправен ли предохранитель и не сработал ли автоматический выключатель"
                    )
                  )
                ),
                WordListItem(
                  "blocked up",
                  "засоренный / засорено (внутри)",
                  markUnderlines(
                    "blocked up",
                    listOf("Засорены"),
                    SpannableStringBuilder(
                      "The nozzle, tube or hose is blocked up – Засорены насадка, трубка или шланг"
                    )
                  )
                ),
                WordListItem(
                  "build up",
                  "builds up",
                  markUnderlines(
                    "build up",
                    listOf("накапливает"),
                    SpannableStringBuilder(
                      "Your vacuum cleaner builds up static electricity – Пылесос накапливает статическое электричество"
                    )
                  )
                )
              )
            ),
            AlphabetListItem(
              "C",
              listOf(
                WordListItem(
                  "crack",
                  "трещина",
                  markUnderlines(
                    "cracks",
                    listOf("трещины"),
                    SpannableStringBuilder(
                      "If the surface of the TV set cracks, do not touch it until you have unplugged the mains lead - Если на поверхности телевизора образовались трещины, перед тем, как прикоснуться к нему, выньте кабель питания из розетки"
                    )
                  )
                ),
                WordListItem(
                  "cabinet",
                  "корпус",
                  markUnderlines(
                    "cabinet",
                    listOf("корпус"),
                    SpannableStringBuilder(
                      "The screen and cabinet get warm when this TV set is in use - Во время работы телевизора экран и корпус нагреваются"
                    )
                  )
                ),
                WordListItem(
                  "Conditional Access Module (CAM)",
                  "модуль ограниченного доступа",
                  markUnderlines(
                    "Conditional Access Module",
                    listOf("модуль ограниченного доступа"),
                    SpannableStringBuilder(
                      "It must be fitted into the Conditional Access Module provided by your authorised dealer - Она должна быть вставлена в модуль ограниченного доступа, предоставленный официальным дилером"
                    )
                  )
                ),
                WordListItem(
                  "Child lock",
                  "электронный замок от детей",
                  ""
                ),
                WordListItem(
                  "Control Panel",
                  "панель управления",
                  ""
                ),
                WordListItem(
                  "Coupler",
                  "соединительная муфта",
                  ""
                ),
                WordListItem(
                  "cleaning agents",
                  "чистящие средства",
                  markUnderlines(
                    "cleaning agents",
                    listOf("чистящие средства"),
                    SpannableStringBuilder(
                      "Do not clean any parts with water and/or cleaning agents if this is not specifically shown in the user manual - Не используйте для очистки воду и (или) чистящие средства, если это явно не указано в руководстве по эксплуатации"
                    )
                  )
                ),
                WordListItem(
                  "cooling",
                  "охлаждение",
                  markUnderlines(
                    "Cooling",
                    listOf("охлаждения"),
                    SpannableStringBuilder(
                      "Cooling method – Способ охлаждения"
                    )
                  )
                ),
                WordListItem(
                  "condensation",
                  "конденсат",
                  markUnderlines(
                    "Condensation",
                    listOf("конденсата"),
                    SpannableStringBuilder(
                      "Condensation inside the oven - Наличие конденсата на внутренних стенках печи"
                    )
                  )
                ),
                WordListItem(
                  "comply",
                  "соответствовать",
                  markUnderlines(
                    "complies",
                    listOf("соответствует"),
                    SpannableStringBuilder(
                      "This appliance complies with the technical rules and standards for safety currently in force - Данный прибор соответствует действующим техническим правилам и стандартам безопасности"
                    )
                  )
                ),

                )
            ),
            AlphabetListItem(
              "D",
              listOf(
                WordListItem(
                  "damaged",
                  "повреждённый",
                  markUnderlines(
                    "damaged",
                    listOf("Поврежден"),
                    SpannableStringBuilder(
                      "Mains lead is damaged - Поврежден кабель питания"
                    )
                  )
                ),
                WordListItem(
                  "disconnect",
                  "отключать",
                  markUnderlines(
                    "Disconnect",
                    listOf("отключайте"),
                    SpannableStringBuilder(
                      "Disconnect the TV set from mains socket and aerial during lightning storms - Во время грозы отключайте телевизор от розетки электропитания и антенны"
                    )
                  )
                ),
                WordListItem(
                  "disposal",
                  "утилизация",
                  markUnderlines(
                    "disposal",
                    listOf("утилизации"),
                    SpannableStringBuilder(
                      "Follow your local ordinances and regulations for disposal - При утилизации соблюдайте соответствующие местные положения и инструкции"
                    )
                  )
                ),
                WordListItem(
                  "distortion",
                  "искажение",
                  markUnderlines(
                    "distortion",
                    listOf("искажение"),
                    SpannableStringBuilder(
                      "Otherwise picture distortion and/or noisy sound may occur - В противном случае может иметь место искажение изображения и/или звука"
                    )
                  )
                ),
                WordListItem(
                  "DC power",
                  "источник питания постоянного тока",
                  markUnderlines(
                    "distortion",
                    listOf("источнику питания постоянного тока"),
                    SpannableStringBuilder(
                      "Never apply DC power to the set - Запрещается подключать телевизор к источнику питания постоянного тока"
                    )
                  )
                ),
                WordListItem(
                  "dealer",
                  "торговая организация (поставщик)",
                  markUnderlines(
                    "dealer",
                    listOf("торговую организацию"),
                    SpannableStringBuilder(
                      "If the set does not operate properly, unplug it and call your dealer - Если телевизор перестает нормально работать, отключите телевизор от электросети и обратитесь за содействием в торговую организацию, которая продала Вам телевизор"
                    )
                  )
                ),
                WordListItem(
                  "Dual reception",
                  "прием программ, передаваемых на двух языках",
                  ""
                ),
                WordListItem(
                  "disposable",
                  "одноразовое использование",
                  markUnderlines(
                    "disposable",
                    listOf("одноразовые батарейки"),
                    SpannableStringBuilder(
                      "Tape the terminals of disposable batteries or put disposable batteries in a plastic bag before you discard them - Прежде чем выбросить одноразовые батарейки, заклейте их клеммы клейкой лентой или поместите батарейки в пластиковый пакет"
                    )
                  )
                ),
                WordListItem(
                  "discard",
                  "выбросить / утилизировать",
                  markUnderlines(
                    "discard",
                    listOf("выбросить"),
                    SpannableStringBuilder(
                      "Tape the terminals of disposable batteries or put disposable batteries in a plastic bag before you discard them - Прежде чем выбросить одноразовые батарейки, заклейте их клеммы клейкой лентой или поместите батарейки в пластиковый пакет"
                    )
                  )
                ),
                WordListItem(
                  "date codes",
                  "дата производства",
                  markUnderlines(
                    "date codes",
                    listOf("датой производства"),
                    SpannableStringBuilder(
                      "Do not mix different brands and types of disposable batteries, do not mix new and used disposable batteries and do not use disposable batteries with different date codes - Не используйте вместе одноразовые батарейки разных марок и типов, не используйте вместе новые и разряженные одноразовые батарейки и не используйте вместе одноразовые батареи с разной датой производства"
                    )
                  )
                ),
                WordListItem(
                  "disassemble",
                  "разбирать (прибор, изделие)",
                  markUnderlines(
                    "do not disassemble",
                    listOf("не разбирайте"),
                    SpannableStringBuilder(
                      ""
                    )
                  )
                ),
                WordListItem(
                  "door seal",
                  "уплотнитель дверцы",
                  markUnderlines(
                    "door seal",
                    listOf("уплотнитель дверцы"),
                    SpannableStringBuilder(
                      "Wipe the interior and the door seal with a damp cloth before using your microwave oven for the first time - Перед первым использованием печи протрите внутренние стенки и уплотнитель дверцы влажной тканью"
                    )
                  )
                )
              )
            ),
            AlphabetListItem(
              "E",
              listOf(
                WordListItem(
                  "environmental",
                  "энергосберегающий",
                  markUnderlines(
                    "environmental",
                    listOf("энергосбережения"),
                    SpannableStringBuilder(
                      "The TV set should be disconnected from the mains for environmental and safety reasons - По соображениям безопасности и энергосбережения устройство следует отключить от сети электропитания"
                    )
                  )
                ),
                WordListItem(
                  "Electromagnetic fields (EMF)",
                  "электромагнитные поля (ЭМП)",
                  ""
                ),
                WordListItem(
                  "electrical cord",
                  "электрошнур",
                  markUnderlines(
                    "electrical cord",
                    listOf("электрошнура"),
                    SpannableStringBuilder(
                      "If the electrical cord becomes damaged, it must be immediately replaced by an Approved Service Centre to avoid any danger - В случае повреждения электрошнура немедленно замените его в уполномоченном сервисном центре во избежание любого риска"
                    )
                  )
                ),
                WordListItem(
                  "explode",
                  "взрываться",
                  markUnderlines(
                    "explode",
                    listOf("взорваться"),
                    SpannableStringBuilder(
                      "Disposable batteries may explode if overheated - Одноразовые батарейки могут взорваться при сильном нагреве"
                    )
                  )
                ),
                WordListItem(
                  "earth connection",
                  "проводник заземления",
                  markUnderlines(
                    "earth connection",
                    listOf("проводник заземления"),
                    SpannableStringBuilder(
                      "If using a mains extension lead, ensure that it is correctly rated(16A), with an earth connection - В случае использования удлинителя убедитесь, что он биполярного типа (16A) с проводником заземления"
                    )
                  )
                ),
                WordListItem(
                  "extension lead",
                  "удлинитель",
                  markUnderlines(
                    "extension lead",
                    listOf("удлинителя"),
                    SpannableStringBuilder(
                      "f using a mains extension lead, ensure that it is correctly rated(16A), with an earth connection - В случае использования удлинителя убедитесь, что он биполярного типа (16A) с проводником заземления"
                    )
                  )
                ),
                WordListItem(
                  "evaporation",
                  "испарение",
                  markUnderlines(
                    "evaporation",
                    listOf("испарения"),
                    SpannableStringBuilder(
                      "Heat concentrates the elements contained in water during evaporation - Во время испарения тепло способствует концентрации содержащихся в воде веществ"
                    )
                  )
                ),
                WordListItem(
                  "Electromagnetic Compatibility",
                  "электромагнитная совместимость",
                  ""
                ),
                WordListItem(
                  "Environnement",
                  "защита окружающей среды",
                  ""
                ),
              )
            ),
            AlphabetListItem(
              "F",
              listOf(
                WordListItem(
                  "front filter",
                  "защитный фильтр",
                  markUnderlines(
                    "front filter",
                    listOf("защитный фильтр"),
                    SpannableStringBuilder(
                      "Do not push or scratch the front filter, or place objects on top of this TV set - Не нажимайте на защитный фильтр, не царапайте его и не ставьте на телевизор какие-либо предметы"
                    )
                  )
                ),
                WordListItem(
                  "failure",
                  "неисправность",
                  markUnderlines(
                    "failure",
                    listOf("неисправности"),
                    SpannableStringBuilder(
                      "This does not indicate a failure - Это не является признаком неисправности"
                    )
                  )
                ),
                WordListItem(
                  "function",
                  "работа / работоспособность (устройства, прибора)",
                  markUnderlines(
                    "function",
                    listOf("работу"),
                    SpannableStringBuilder(
                      "Doing so may affect its function - Это может повлиять на его работу"
                    )
                  )
                ),
                WordListItem(
                  "flammable substances",
                  "горючие вещества",
                  markUnderlines(
                    "flammable substances",
                    listOf("горючие вещества"),
                    SpannableStringBuilder(
                      "Never vacuum up water or any other liquid, flammable substances or hot ashes - Запрещается убирать при помощи пылесоса воду и другие жидкости, горючие вещества и горячий пепел"
                    )
                  )
                ),
                WordListItem(
                  "fuse",
                  "предохранитель",
                  markUnderlines(
                    "fuse",
                    listOf("предохранитель"),
                    SpannableStringBuilder(
                      "Have you overloaded the electric circuit and caused a fuse to blow or a breaker to be triggered? - Проверьте, не перегружена ли электрическая цепь, исправен ли предохранитель и не сработал ли автоматический выключатель"
                    )
                  )
                ),

                )
            ),
            AlphabetListItem(
              "G",
              listOf(
                WordListItem(
                  "ghosting",
                  "остаточные изображения",
                  markUnderlines(
                    "ghosting",
                    listOf("остаточные изображения"),
                    SpannableStringBuilder(
                      "Ghosting may occur when still pictures are displayed continuously - При продолжительной демонстрации неподвижного изображения могут появляться остаточные изображения"
                    )
                  )
                )
              )
            ),
            AlphabetListItem(
              "H",
              listOf(
                WordListItem(
                  "hazards",
                  "источники опасности",
                  markUnderlines(
                    "hazards",
                    listOf("источники опасности"),
                    SpannableStringBuilder(
                      "Never remove the back cover of the set as this can expose you to very high voltage and other hazards – Никогда не открывайте заднюю стенку телевизора, поскольку в телевизоре имеются опасное для жизни напряжение и другие источники опасности"
                    )
                  )
                ),
                WordListItem(
                  "handgrip",
                  "ручка / рукоятка (прибора)",
                  markUnderlines(
                    "handgrip",
                    listOf("ручке"),
                    SpannableStringBuilder(
                      "Increase the suction power with the regulator on the appliance or on the handgrip - С помощью регулятора на приборе или ручке увеличьте силу всасывания"
                    )
                  )
                ),
                WordListItem(
                  "hose",
                  "шланг (прибора)",
                  markUnderlines(
                    "hose",
                    listOf("шланг"),
                    SpannableStringBuilder(
                      "The nozzle, tube or hose is blocked up – Засорены насадка, трубка или шланг"
                    )
                  )
                ),
                WordListItem(
                  "heel",
                  "опора",
                  markUnderlines(
                    "heel",
                    listOf("пяту-опору"),
                    SpannableStringBuilder(
                      "Always set your iron on its heel - Всегда ставьте утюг на пяту-опору"
                    )
                  )
                )
              )
            ),
            AlphabetListItem(
              "I",
              listOf(
                WordListItem(
                  "important notice",
                  "важное примечание",
                  ""
                ),
                WordListItem(
                  "input",
                  "входной сигнал",
                  markUnderlines(
                    "input",
                    listOf("входного сигнала"),
                    SpannableStringBuilder(
                      "To change to other input - Выбор другого источника входного сигнала"
                    )
                  )
                ),
                WordListItem(
                  "install",
                  "вставлять",
                  markUnderlines(
                    "Install",
                    listOf("Вставьте"),
                    SpannableStringBuilder(
                      "Install the batteries – Вставьте элементы питания"
                    )
                  )
                ),
                WordListItem(
                  "installation",
                  "установка",
                  markUnderlines(
                    "installation",
                    listOf("Установка"),
                    SpannableStringBuilder(
                      "Battery installation – Установка батареек в пульт дистанционного управления (ПДУ)"
                    )
                  )
                ),
                WordListItem(
                  "installing",
                  "установка (прибора, изделия)",
                  markUnderlines(
                    "Installing",
                    listOf("установка"),
                    SpannableStringBuilder(
                      "Installing Your Microwave oven - Установка микроволновой печи"
                    )
                  )
                ),
                WordListItem(
                  "interior",
                  "внутренние стенки",
                  markUnderlines(
                    "interior",
                    listOf("внутренние стенки"),
                    SpannableStringBuilder(
                      "Wipe the interior and the door seal with a damp cloth before using your microwave oven for the first time - Перед первым использованием печи протрите внутренние стенки и уплотнитель дверцы влажной тканью"
                    )
                  )
                ),
                WordListItem(
                  "intended",
                  "предназначенный / ое (для кого-то / чего-то прибор / изделие)",
                  markUnderlines(
                    "intended",
                    listOf("использоваться"),
                    SpannableStringBuilder(
                      "This appliance is not intended for use by persons (including children) with reduced physical, sensory or mental capabilities, or lack of experience and knowledge, unless they have been given supervision or instruction concerning use of the appliance by a person responsible for their safety - Данный электроприбор не должен использоваться лицами, (в том числе, детьми) с ограниченными физическими, сенсорными или умственными возможностями, а также лицами, не обладающими необходимым опытом и знаниями, если только они не будут находиться под присмотром лица, отвечающего за их безопасность, и не получат от него предварительные разъяснения относительно использования электроприбора"
                    )
                  )
                ),
                WordListItem(
                  "invalidate",
                  "аннулирование (гарантии)",
                  markUnderlines(
                    "invalidate the guarantee",
                    listOf("аннулированию гарантии"),
                    SpannableStringBuilder(
                      "Connecting to the wrong voltage may cause irreversible damage to the iron and will invalidate the guarantee – Неправильное подключение может вызвать непоправимый ущерб и привести к аннулированию гарантии"
                    )
                  )
                ),
                WordListItem(
                  "immerse",
                  "погружать",
                  markUnderlines(
                    "immerse",
                    listOf("погружайте"),
                    SpannableStringBuilder(
                      "Never immerse it in water! - Никогда не погружайте в воду!"
                    )
                  )
                )
              )
            ),
            AlphabetListItem(
              "L",
              listOf(
                WordListItem(
                  "location",
                  "место(а) расположения / положение (чего-то)",
                  markUnderlines(
                    "locations",
                    listOf("положение"),
                    SpannableStringBuilder(
                      "Unstable locations, near water, rain, moisture or smoke – Неустойчивое положение вблизи воды, или там, где возможно воздействие на него дождя, влаги или дыма"
                    )
                  )
                ),
                WordListItem(
                  "LCD TV",
                  "ЖК-телевизор",
                  markUnderlines(
                    "LCD TV",
                    listOf("ЖК-телевизора"),
                    SpannableStringBuilder(
                      "About LCD TV Temperature - О температуре ЖК-телевизора"
                    )
                  )
                ),
                WordListItem(
                  "liquid",
                  "жидкость",
                  markUnderlines(
                    "liquid",
                    listOf("жидкости"),
                    SpannableStringBuilder(
                      "Never vacuum up water or any other liquid, flammable substances or hot ashes - Запрещается убирать при помощи пылесоса воду и другие жидкости, горючие вещества и горячий пепел"
                    )
                  )
                ),
                WordListItem(
                  "Low Voltage",
                  "низкое напряжение",
                  ""
                )
              )
            ),
            AlphabetListItem(
              "M",
              listOf(
                WordListItem(
                  "manual",
                  "инструкция по эксплуатации",
                  markUnderlines(
                    "manual",
                    listOf("инструкцией по эксплуатации"),
                    SpannableStringBuilder(
                      "Before operating the TV, please read this manual thoroughly and retain it for future reference» - Перед первым включением телевизора внимательно ознакомьтесь с данной инструкцией по эксплуатации и сохраните ее для консультаций в будущем"
                    )
                  )
                ),
                WordListItem(
                  "mains socket",
                  "электрическая розетка",
                  markUnderlines(
                    "mains socket",
                    listOf("электрическую розетку"),
                    SpannableStringBuilder(
                      "The set is not disconnected from the mains source as long as it is connected to the mains socket, even if the set itself has been turned off - Пока устройство включено в электрическую розетку, на него по-прежнему подается электропитание, даже если само устройство выключено"
                    )
                  )
                ),
                WordListItem(
                  "mains source",
                  "электропитание",
                  markUnderlines(
                    "mains source",
                    listOf("электропитание"),
                    SpannableStringBuilder(
                      "The set is not disconnected from the mains source as long as it is connected to the mains socket, even if the set itself has been turned off - Пока устройство включено в электрическую розетку, на него по-прежнему подается электропитание, даже если само устройство выключено"
                    )
                  )
                ),
                WordListItem(
                  "mains lead",
                  "кабель питания",
                  markUnderlines(
                    "mains lead",
                    listOf("кабель питания"),
                    SpannableStringBuilder(
                      "If the surface of the TV set cracks, do not touch it until you have unplugged the mains lead - Если на поверхности телевизора образовались трещины, перед тем, как прикоснуться к нему, выньте кабель питания из розетки"
                    )
                  )
                ),
                WordListItem(
                  "mains",
                  "сеть электропитания",
                  markUnderlines(
                    "mains",
                    listOf("сети электропитания"),
                    SpannableStringBuilder(
                      "The TV set should be disconnected from the mains for environmental and safety reasons - По соображениям безопасности и энергосбережения устройство следует отключить от сети электропитания"
                    )
                  )
                ),
                WordListItem(
                  "material",
                  "конструкция / материал",
                  markUnderlines(
                    "material",
                    listOf("конструкционных материалов"),
                    SpannableStringBuilder(
                      "To avoid material degradation or screen coating degradation, observe the following precautions - Для обеспечения сохранности конструкционных материалов и покрытия экрана телевизора соблюдайте следующие меры предосторожности"
                    )
                  )
                ),
                WordListItem(
                  "malfunction",
                  "неисправность",
                  markUnderlines(
                    "malfunction",
                    listOf("неисправности"),
                    SpannableStringBuilder(
                      "This is a structural property of the LCD screen and is not a malfunction - Это структурное свойство ЖК-экрана, которое не является признаком неисправности"
                    )
                  )
                ),
                WordListItem(
                  "mute",
                  "беззвучный режим",
                  markUnderlines(
                    "Mute",
                    listOf("беззвучного режима"),
                    SpannableStringBuilder(
                      "Mute function – Функция беззвучного режима"
                    )
                  )
                ),
                WordListItem(
                  "mono sound",
                  "монофонический звук",
                  markUnderlines(
                    "Mono sound",
                    listOf("монофонического звука"),
                    SpannableStringBuilder(
                      "Mono sound selection – Установка монофонического звука"
                    )
                  )
                ),
                WordListItem(
                  "MAIN POWER",
                  "выключатель питания",
                  ""
                ),
                WordListItem(
                  "Manual programme tuning",
                  "ручная настройка на станции",
                  ""
                ),
                WordListItem(
                  "mode",
                  "режим (automatic - автоматический, manual - ручной)",
                  markUnderlines(
                    "automatic or manual modes",
                    listOf("автоматическом или ручном режиме"),
                    SpannableStringBuilder(
                      "Stations can be tuned using automatic or manual modes – На станции можно настраиваться в автоматическом или ручном режиме"
                    )
                  )
                ),
                WordListItem(
                  "misuse",
                  "неправильное использование (прибора, изделия)",
                  markUnderlines(
                    "misuse",
                    listOf("неправильное использование"),
                    SpannableStringBuilder(
                      "Any misuse can cause electric shock, burns, fire and other hazards or injuries - Любое неправильное использование изделия может привести к поражению электрическим током, ожогам, возгоранию и другим опасным последствиям, и травмам"
                    )
                  )
                )
              )
            ),
            AlphabetListItem(
              "N",
              listOf(
                WordListItem(
                  "not in use",
                  "неиспользование (в неиспользовании)",
                  markUnderlines(
                    "not in use",
                    listOf("не используется"),
                    SpannableStringBuilder(
                      "When not in use – Если телевизор не используется"
                    )
                  )
                ),
                WordListItem(
                  "nozzle",
                  "насадка (к прибору)",
                  markUnderlines(
                    "nozzle",
                    listOf("насадка"),
                    SpannableStringBuilder(
                      "The nozzle, tube or hose is blocked up – Засорены насадка, трубка или шланг"
                    )
                  )
                )
              )
            ),
            AlphabetListItem(
              "O",
              listOf(
                WordListItem(
                  "operate",
                  "использовать (прибор, изделие)",
                  markUnderlines(
                    "operate",
                    listOf("Используйте"),
                    SpannableStringBuilder(
                      "Only operate this product on the type of disposable battery specified in the user manual - Используйте это изделие только с тем типом одноразовой батарейки, который указан в руководстве пользователя"
                    )
                  )
                ),
                WordListItem(
                  "operating instructions",
                  "инструкция по эксплуатации",
                  ""
                ),
                WordListItem(
                  "operating",
                  "включение",
                  markUnderlines(
                    "operating",
                    listOf("включением"),
                    SpannableStringBuilder(
                      "Before operating the TV, please read this manual thoroughly and retain it for future reference» - Перед первым включением телевизора внимательно ознакомьтесь с данной инструкцией по эксплуатации и сохраните ее для консультаций в будущем"
                    )
                  )
                ),
                WordListItem(
                  "owner",
                  "пользователь",
                  markUnderlines(
                    "Owner’s",
                    listOf("пользователя"),
                    SpannableStringBuilder(
                      "Owner’s manual – руководство пользователя"
                    )
                  )
                ),
                WordListItem(
                  "overloaded",
                  "перенапряжение / чрезмерная нагрузка на сеть",
                  markUnderlines(
                    "overloaded",
                    listOf("перегружена"),
                    SpannableStringBuilder(
                      "Have you overloaded the electric circuit and caused a fuse to blow or a breaker to be triggered? - Проверьте, не перегружена ли электрическая цепь, исправен ли предохранитель и не сработал ли автоматический выключатель"
                    )
                  )
                ),
                WordListItem(
                  "outer casing",
                  "внешнее покрытие / внешний корпус",
                  markUnderlines(
                    "outer casing",
                    listOf("внешнего покрытия"),
                    SpannableStringBuilder(
                      "Air flow around the door and outer casing - Поток воздуха в области дверцы или внешнего покрытия"
                    )
                  )
                )
              )
            ),
            AlphabetListItem(
              "P",
              listOf(
                WordListItem(
                  "prohibited usage",
                  "запрещенные типы установки",
                  ""
                ),
                WordListItem(
                  "precautions",
                  "меры предосторожности",
                  markUnderlines(
                    "precautions",
                    listOf("меры предосторожности"),
                    SpannableStringBuilder(
                      "To avoid material degradation or screen coating degradation, observe the following precautions - Для обеспечения сохранности конструкционных материалов и покрытия экрана телевизора соблюдайте следующие меры предосторожности"
                    )
                  )
                ),
                WordListItem(
                  "product",
                  "устройство",
                  markUnderlines(
                    "product",
                    listOf("устройство"),
                    SpannableStringBuilder(
                      "Thank you for choosing this Sony product - Благодарим Вас за то, что Вы выбрали устройство Sony"
                    )
                  )
                ),
                WordListItem(
                  "poor fitting",
                  "плохие контакты",
                  markUnderlines(
                    "poor fitting",
                    listOf("плохие контакты"),
                    SpannableStringBuilder(
                      "Poor fitting of mains socket - Электророзетка имеет плохие контакты"
                    )
                  )
                ),
                WordListItem(
                  "pull",
                  "вынуть",
                  markUnderlines(
                    "Pull",
                    listOf("Выньте"),
                    SpannableStringBuilder(
                      "Pull the plug from the mains - Выньте вилку кабеля питания из розетки"
                    )
                  )
                ),
                WordListItem(
                  "problem",
                  "неисправность",
                  markUnderlines(
                    "problems",
                    listOf("неисправности"),
                    SpannableStringBuilder(
                      "If the following problems occur - Если имеют место следующие неисправности"
                    )
                  )
                ),
                WordListItem(
                  "panel",
                  "поверхность",
                  markUnderlines(
                    "panel",
                    listOf("поверхности"),
                    SpannableStringBuilder(
                      "When the LCD TV is used for an extended period, the panel surrounds become warm - При длительном использовании ЖК-телевизора его поверхности нагреваются"
                    )
                  )
                ),
                WordListItem(
                  "press",
                  "нажимать (на кнопку устройства)",
                  markUnderlines(
                    "press",
                    listOf("Нажмите"),
                    SpannableStringBuilder(
                      "Short press to turn the TV on – Нажмите, чтобы включить телевизор"
                    )
                  )
                ),
                WordListItem(
                  "POWER",
                  "Вкл / Выкл",
                  ""
                ),
                WordListItem(
                  "powercut",
                  "отключение напряжения (в электросети)",
                  markUnderlines(
                    "powercuts",
                    listOf("отключениях напряжения"),
                    SpannableStringBuilder(
                      "In the event of thunderstorms or powercuts, please pull out the aerial and mains plugs – Во время грозы и при частых отключениях напряжения в электросети извлеките штекер кабеля антенны из гнезда антенны и отсоедините вилку шнура питания от розетки электросети"
                    )
                  )
                ),
                WordListItem(
                  "Programme selection",
                  "переключение каналов",
                  ""
                ),
                WordListItem(
                  "Programme edit",
                  "редактирование программ",
                  ""
                ),
                WordListItem(
                  "Picture adjustment",
                  "настройка изображения",
                  ""
                ),
                WordListItem(
                  "paging",
                  "просмотр страниц (телевизионных программ)",
                  markUnderlines(
                    "paging",
                    listOf("Просмотр страниц"),
                    SpannableStringBuilder(
                      "Paging through a programme table – Просмотр страниц таблицы программ"
                    )
                  )
                ),
                WordListItem(
                  "precautions",
                  "правила техники безопасности / меры предосторожности",
                  markUnderlines(
                    "safety precautions",
                    listOf("правила техники безопасности"),
                    SpannableStringBuilder(
                      "Take any necessary safety precautions when you dispose of batteries - При утилизации одноразовых батареек соблюдайте необходимые правила техники безопасности"
                    )
                  )
                ),
                WordListItem(
                  "purchase",
                  "покупка / приобретение (прибора, изделия)",
                  markUnderlines(
                    "purchase",
                    listOf("покупкой"),
                    SpannableStringBuilder(
                      "Congratulations on your purchase and welcome to Philips! - Поздравляем с покупкой продукции Philips!"
                    )
                  )
                ),
                WordListItem(
                  "prevent",
                  "предотвращать / не допускать",
                  markUnderlines(
                    "prevent",
                    listOf("не допустить"),
                    SpannableStringBuilder(
                      "To prevent disposable batteries from heating up or releasing toxic or hazardous substances, do not disassemble, modify, pierce, damage or short-circuit disposable batteries - Чтобы не допустить нагрева или высвобождения токсичных, или опасных веществ, не разбирайте, не модифицируйте, не прокалывайте и не повреждайте одноразовые батарейки, а также не допускайте их короткого замыкания"
                    )
                  )
                ),
                WordListItem(
                  "Power Levels",
                  "уровни мощности",
                  ""
                ),
                WordListItem(
                  "Power source",
                  "источник питания",
                  markUnderlines(
                    "",
                    listOf(""),
                    SpannableStringBuilder(
                      ""
                    )
                  )
                ),
                WordListItem(
                  "premature wear",
                  "преждевременный износ (прибора, изделия)",
                  markUnderlines(
                    "premature wear",
                    listOf("преждевременный износ"),
                    SpannableStringBuilder(
                      "The types of water listed below contain organic waste or mineral elements that can cause spitting, brown staining, or premature wear of the appliance -  Некоторые виды воды содержат органические отходы и минеральные соли, которые могут вызвать появление брызг, коричневых потеков или преждевременный износ прибора"
                    )
                  )
                )
              )
            ),
            AlphabetListItem(
              "Q",
              listOf(
                WordListItem(
                  "Quick view",
                  "быстрый просмотр",
                  ""
                )
              )
            ),
            AlphabetListItem(
              "R",
              listOf(
                WordListItem(
                  "retain",
                  "сохранить (что-либо: товарный чек прибора, деталь и т.д.)",
                  markUnderlines(
                    "retain",
                    listOf("сохраните"),
                    SpannableStringBuilder(
                      "Before operating the TV, please read this manual thoroughly and retain it for future reference» - Перед первым включением телевизора внимательно ознакомьтесь с данной инструкцией по эксплуатации и сохраните ее для консультаций в будущем"
                    )
                  )
                ),
                WordListItem(
                  "remote control",
                  "пульт дистанционного управления (ДУ)",
                  markUnderlines(
                    "remote control",
                    listOf("пультом ДУ"),
                    SpannableStringBuilder(
                      "Handle the remote control with care - Бережно обращайтесь с пультом ДУ"
                    )
                  )
                ),
                WordListItem(
                  "remote control handset",
                  "пульт дистанционного управления (ПДУ)",
                  markUnderlines(
                    "remote control handset",
                    listOf("ПДУ"),
                    SpannableStringBuilder(
                      "To load the batteries, turn the remote control handset over and open the battery compartment – Осторожно сдвиньте крышку ПДУ, чтобы открылось отделение для батареек"
                    )
                  )
                ),
                WordListItem(
                  "reveal",
                  "отображение",
                  markUnderlines(
                    "reveal",
                    listOf("Отображение"),
                    SpannableStringBuilder(
                      "Text reveal - Отображение телетекста"
                    )
                  )
                ),
                WordListItem(
                  "remove",
                  "извлекать (из корпуса изделия)",
                  markUnderlines(
                    "remove",
                    listOf("извлеките"),
                    SpannableStringBuilder(
                      "Remove disposable batteries from the product if you are not going to use it for some time - Если вы не планируете пользоваться данным изделием в течение длительного времени, извлеките из него одноразовые батарейки"
                    )
                  )
                ),
                WordListItem(
                  "replace",
                  "заменять (деталь прибора)",
                  markUnderlines(
                    "replace",
                    listOf("Замените"),
                    SpannableStringBuilder(
                      "Replace a washable filter if it can no longer be cleaned properly or if it is damaged - Замените моющийся фильтр на новый, если он поврежден или его очистка должным образом больше невозможна"
                    )
                  )
                ),
                WordListItem(
                  "recharge",
                  "заряжать",
                  markUnderlines(
                    "recharge non-rechargeable",
                    listOf("заряжать не перезаряжаемые"),
                    SpannableStringBuilder(
                      "Do not recharge non-rechargeable disposable batteries - Запрещается заряжать не перезаряжаемые одноразовые батарейки"
                    )
                  )
                ),
                WordListItem(
                  "reference",
                  "использование / обращение",
                  markUnderlines(
                    "future reference",
                    listOf("дальнейшего использования"),
                    SpannableStringBuilder(
                      "Please read these instructions carefully and keep them for future reference – Внимательно прочитайте инструкцию и сохраните ее для дальнейшего использования"
                    )
                  )
                ),
                WordListItem(
                  "Reheating",
                  "разогрев продуктов (прим.: про микроволновую печь)",
                  ""
                ),
                WordListItem(
                  "Roller ring",
                  "роликовая подставка",
                  ""
                )
              )
            ),
            AlphabetListItem(
              "S",
              listOf(
                WordListItem(
                  "set",
                  "устройство",
                  markUnderlines(
                    "set",
                    listOf("устройство"),
                    SpannableStringBuilder(
                      "The set is not disconnected from the mains source as long as it is connected to the mains socket, even if the set itself has been turned off - Пока устройство включено в электрическую розетку, на него по-прежнему подается электропитание, даже если само устройство выключено"
                    )
                  )
                ),
                WordListItem(
                  "screen coating",
                  "покрытие экрана",
                  markUnderlines(
                    "screen coating",
                    listOf("покрытия экрана"),
                    SpannableStringBuilder(
                      "To avoid material degradation or screen coating degradation, observe the following precautions - Для обеспечения сохранности конструкционных материалов и покрытия экрана телевизора соблюдайте следующие меры предосторожности"
                    )
                  )
                ),
                WordListItem(
                  "smear",
                  "размытие (изображения / экрана)",
                  markUnderlines(
                    "smear",
                    listOf("размытым"),
                    SpannableStringBuilder(
                      "A smear may occur in the picture or the picture may become dark - Изображение может оказаться размытым или слишком темным"
                    )
                  )
                ),
                WordListItem(
                  "sound",
                  "звуковая дорожка",
                  markUnderlines(
                    "sound",
                    listOf("звуковую дорожку"),
                    SpannableStringBuilder(
                      "Select the sound - Выберите звуковую дорожку"
                    )
                  )
                ),
                WordListItem(
                  "slot",
                  "гнездо",
                  markUnderlines(
                    "slot",
                    listOf("гнездо"),
                    SpannableStringBuilder(
                      "Do not insert the smart card directly into the TV CAM slot - Не устанавливайте смарт-карту непосредственно в гнездо TV CAM"
                    )
                  )
                ),
                WordListItem(
                  "scratch",
                  "царапина (царапать)",
                  markUnderlines(
                    "scratch",
                    listOf("царапайте"),
                    SpannableStringBuilder(
                      "Do not push or scratch the front filter, or place objects on top of this TV set - Не нажимайте на защитный фильтр, не царапайте его и не ставьте на телевизор какие-либо предметы"
                    )
                  )
                ),
                WordListItem(
                  "Stereo reception",
                  "прием стереофонических программ",
                  ""
                ),
                WordListItem(
                  "STILL",
                  "стоп-кадр",
                  ""
                ),
                WordListItem(
                  "stationname",
                  "наименование программы",
                  markUnderlines(
                    "stationname",
                    listOf("номера программы"),
                    SpannableStringBuilder(
                      "Also you can assign a stationname with five characters to each programme number – Также вы можете дат программе имя, состоящее из пяти символов для каждого номера программы"
                    )
                  )
                ),
                WordListItem(
                  "swapping",
                  "замещение (на что-либо)",
                  markUnderlines(
                    "swapping",
                    listOf("Замена"),
                    SpannableStringBuilder(
                      "Swapping between main and sub pictures – Замена субкартинки на основную картинку"
                    )
                  )
                ),
                WordListItem(
                  "suction",
                  "всасывание",
                  markUnderlines(
                    "suction",
                    listOf("всасывания"),
                    SpannableStringBuilder(
                      "Increase the suction power with the regulator on the appliance or on the handgrip - С помощью регулятора на приборе или ручке увеличьте силу всасывания"
                    )
                  )
                ),
                WordListItem(
                  "short-circui",
                  "короткое замыкание",
                  markUnderlines(
                    "short-circuit",
                    listOf("короткого замыкания"),
                    SpannableStringBuilder(
                      "To prevent disposable batteries from heating up or releasing toxic or hazardous substances, do not disassemble, modify, pierce, damage or short-circuit disposable batteries - Чтобы не допустить нагрева или высвобождения токсичных, или опасных веществ, не разбирайте, не модифицируйте, не прокалывайте и не повреждайте одноразовые батарейки, а также не допускайте их короткого замыкания"
                    )
                  )
                ),
                WordListItem(
                  "Safety information",
                  "сведения о безопасности",
                  ""
                ),
                WordListItem(
                  "Steam setting",
                  "установка пара (прим.: для электрического утюга)",
                  ""
                ),
                WordListItem(
                  "storage",
                  "хранение (прибора, изделия)",
                  markUnderlines(
                    "storage",
                    listOf("хранение"),
                    SpannableStringBuilder(
                      "Iron storage - Хранение утюга"
                    )
                  )
                ),
                WordListItem(
                  "surface",
                  "поверхность",
                  markUnderlines(
                    "surface",
                    listOf("устойчивая поверхность"),
                    SpannableStringBuilder(
                      "Stable surface - устойчивая поверхность"
                    )
                  )
                ),
                WordListItem(
                  "set",
                  "ставить (прибор, изделие куда-либо / на что-то)",
                  markUnderlines(
                    "set",
                    listOf("ставьте"),
                    SpannableStringBuilder(
                      "Always set your iron on its heel - Всегда ставьте утюг на пяту-опору"
                    )
                  )
                )
              )
            ),
            AlphabetListItem(
              "T",
              listOf(
                WordListItem(
                  "turn off",
                  "выключать",
                  markUnderlines(
                    "turned off",
                    listOf("выключено"),
                    SpannableStringBuilder(
                      "The set is not disconnected from the mains source as long as it is connected to the mains socket, even if the set itself has been turned off - Пока устройство включено в электрическую розетку, на него по-прежнему подается электропитание, даже если само устройство выключено"
                    )
                  )
                ),
                WordListItem(
                  "text",
                  "режим телетекста",
                  markUnderlines(
                    "text",
                    listOf("режиме телетекста"),
                    SpannableStringBuilder(
                      "Text hold - Удержание в режиме телетекста"
                    )
                  )
                ),
                WordListItem(
                  "table of contents",
                  "содержание",
                  ""
                ),
                WordListItem(
                  "tuning",
                  "настройка (теле-, радиостанций / передач)",
                  markUnderlines(
                    "tuning",
                    listOf("настройка"),
                    SpannableStringBuilder(
                      "Auto programme tuning – Автоматическая настройка на телевизионные станции"
                    )
                  )
                ),
                WordListItem(
                  "troubleshooting",
                  "устранение неисправностей / диагностика",
                  markUnderlines(
                    "troubleshooting",
                    listOf("устранения неисправностей"),
                    SpannableStringBuilder(
                      "Troubleshooting check list – Порядок поиска причины и устранения неисправностей"
                    )
                  )
                ),
                WordListItem(
                  "turntable",
                  "вращающийся поднос (прим.: в микроволновой печи)",
                  markUnderlines(
                    "turntable",
                    listOf("вращающегося подноса"),
                    SpannableStringBuilder(
                      "First, place the frozen food in the centre of the turntable and close the door - Поместите замороженные продукты в центр вращающегося подноса и закройте дверцу"
                    )
                  )
                ),
                WordListItem(
                  "Temperature setting",
                  "установка температуры",
                  ""
                )
              )
            ),
            AlphabetListItem(
              "U",
              listOf(
                WordListItem(
                  "unstable",
                  "неустойчивое (расположение / место)",
                  markUnderlines(
                    "unstable",
                    listOf("Неустойчивое положение"),
                    SpannableStringBuilder(
                      "Unstable locations, near water, rain, moisture or smoke – Неустойчивое положение вблизи воды, или там, где возможно воздействие на него дождя, влаги или дыма"
                    )
                  )
                ),
                WordListItem(
                  "unplug (1)",
                  "отсоединить",
                  markUnderlines(
                    "to unplug",
                    listOf("отсоедините"),
                    SpannableStringBuilder(
                      "Be sure to unplug the mains lead connected to the TV set from mains socket before cleaning – Перед чисткой телевизора или вилки кабеля питания отсоедините кабель от сети"
                    )
                  )
                ),
                WordListItem(
                  "unplug (2)",
                  "отключать (шнур, провод, кабель устройства)",
                  markUnderlines(
                    "unplugging",
                    listOf("отключением"),
                    SpannableStringBuilder(
                      "Make sure that the TV is completely turned off before unplugging the AC power cord - Убедитесь, что телевизор выключен перед отключением шнура питания переменного тока"
                    )
                  )
                )
              )
            ),
            AlphabetListItem(
              "V",
              listOf(
                WordListItem(
                  "ventilation openings",
                  "вентиляционные отверстия",
                  markUnderlines(
                    "ventilation openings",
                    listOf("вентиляционных отверстий"),
                    SpannableStringBuilder(
                      "Do not cover the ventilation openings on the back cover – Не закрывайте вентиляционных отверстий на задней стенке телевизора"
                    )
                  )
                ),
                WordListItem(
                  "voltage",
                  "напряжение",
                  markUnderlines(
                    "The voltage",
                    listOf("напряжение"),
                    SpannableStringBuilder(
                      "The voltage of your electrical installation must correspond to that of the iron (220V-240V) – Напряжение вашей электросети должно соответствовать напряжению утюга (220V-240В)"
                    )
                  )
                )
              )
            ),
            AlphabetListItem(
              "W",
              listOf(
                WordListItem(
                  "wrap",
                  "завертывать / заворачивать (во что-то)",
                  markUnderlines(
                    "wrap",
                    listOf("завертывать"),
                    SpannableStringBuilder(
                      "Do not wrap disposable batteries in aluminum foil - Запрещается завертывать одноразовые батарейки в алюминиевую фольгу"
                    )
                  )
                ),
                WordListItem(
                  "warping",
                  "деформация",
                  markUnderlines(
                    "warping",
                    listOf("деформация"),
                    SpannableStringBuilder(
                      "Fire, electric shock, or warping may result - Иначе может произойти возгорание, удар электрическим током или деформация"
                    )
                  )
                ),
                WordListItem(
                  "working life",
                  "срок службы",
                  markUnderlines(
                    "The working life",
                    listOf("Срок службы"),
                    SpannableStringBuilder(
                      "The working life of this set is 7 years since the date of delivery to consumer – Срок службы этого товара – 7 лет со дня передачи товара потребителю"
                    )
                  )
                ),
                WordListItem(
                  "warranty leaflet",
                  "гарантийный талон",
                  markUnderlines(
                    "warranty leaflet",
                    listOf("гарантийном талоне"),
                    SpannableStringBuilder(
                      "If you need information or support, please visit www.philips.com/support or read the international warranty leaflet - Для получения дополнительной информации посетите веб сайт www.philips.com/support или обратитесь в центр поддержки потребителей Philips в вашей стране по номеру, указанному в гарантийном талоне"
                    )
                  )
                ),
                WordListItem(
                  "water tank filling",
                  "заполнение резервуара для воды",
                  markUnderlines(
                    "filling the tank",
                    listOf("заполнении резервуара"),
                    SpannableStringBuilder(
                      "Steam or water come from the iron as you finish filling the tank - При заполнении резервуара образуется пар"
                    )
                  )
                ),
                WordListItem(
                  "Warning",
                  "Внимание",
                  ""
                )
              )
            )
          )
        }

        initializedList = deferred.await()
      }

      initializedList
    }

  private fun markUnderlines(word: String, translations: List<String>, spannable: SpannableStringBuilder): SpannableStringBuilder {
    val wordIndex = spannable.indexOf(word, ignoreCase = true)

    if (wordIndex != -1)
      spannable.setSpan(object : UnderlineSpan() {}, wordIndex, wordIndex + word.length, SpannableStringBuilder.SPAN_INCLUSIVE_EXCLUSIVE)

    translations.forEach {
      val translationIndex = spannable.indexOf(it, ignoreCase = true)

      if (translationIndex != -1)
        spannable.setSpan(object : UnderlineSpan() {}, translationIndex, translationIndex + it.length, SpannableStringBuilder.SPAN_INCLUSIVE_EXCLUSIVE)
    }

    return spannable
  }
}