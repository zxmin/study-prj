# java.time

- Instant
  瞬时实例，时间戳
  
- LocalDate
  不包含具体时间的日期，比如2020-01-14
  本地日期，不包含具体时间 例如：2014-01-14 可以用来记录生日、纪念日、加盟日等
  
- LocalTime
  不含日期的时间
  
- LocalDateTime
  包含了日期及时间，不过还是没有偏移信息或者说时区
  
- ZonedDateTime
  包含时区的完整的日期时间，偏移量是以UTC/格林威治时间为基准，有时间规则
  
- OffsetDateTime
  包含时区的完整的日期时间，偏移量是以UTC/格林威治时间为基准的