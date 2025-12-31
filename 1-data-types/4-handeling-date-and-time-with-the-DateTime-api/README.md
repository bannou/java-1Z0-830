# DateTime API Date Time objects

java.time Package

## LocalDate

Represents an object that holds year, month and day informations.

- implements java.time.temporal.Temporal
- is immutable
- is created with .of(), .now() or from an existing one with the methods withXXX(), plusXXX() or minusXXX()
- can be compared with equals(), isBefore() and isAfter() 

> ChronoUnit values for LocalDate
> - DAYS
> - WEEKS
> - MONTHS
> - YEARS
> - DECADES
> - CENTURIES
> - MILLENNIA
> - ERAS

## LocalTime

Represents an object that holds hour, minutes, seconds and nanoseconds informations.

- implements java.time.temporal.Temporal
- is immutable
- is created with .of(), .now() or from an existing one with the methods withXXX(), plusXXX() or minusXXX()
- can be compared with equals(), isBefore() and isAfter()

> ChronoUnit values for LocalTime
> 
> - NANOS
> - MICROS
> - MILLIS
> - SECONDS
> - MINUTES
> - HOURS
> - HALF_DAYS

## LocalDateTime

Represents both a date and time information.

- implements java.time.temporal.Temporal
- is immutable
- is created with .of(), .now() or from an existing one with the methods withXXX(), plusXXX() or minusXXX()
- can be compared with equals(), isBefore() and isAfter()

> ChronoUnit values for LocalTime
>
> - NANO_OF_SECOND
> - NANO_OF_DAY
> - MICRO_OF_SECOND
> - MICRO_OF_DAY
> - MILLI_OF_SECOND
> - MILLI_OF_DAY
> - SECOND_OF_MINUTE
> - SECOND_OF_DAY
> - MINUTE_OF_HOUR
> - MINUTE_OF_DAY
> - HOUR_OF_AMPM
> - CLOCK_HOUR_OF_AMPM
> - HOUR_OF_DAY
> - CLOCK_HOUR_OF_DAY
> - AMPM_OF_DAY
> - DAY_OF_WEEK
> - ALIGNED_DAY_OF_WEEK_IN_MONTH
> - ALIGNED_DAY_OF_WEEK_IN_YEAR
> - DAY_OF_MONTH
> - DAY_OF_YEAR
> - EPOCH_DAY
> - ALIGNED_WEEK_OF_MONTH
> - ALIGNED_WEEK_OF_YEAR
> - MONTH_OF_YEAR
> - PROLEPTIC_MONTH
> - YEAR_OF_ERA
> - YEAR
> - ERA

## Instant

A number of seconds (long) and nanoseconds (integer) since January, 1st 1970 (Unix epoch). 
Instants before epoch time have negative values.
Instants after epoch time have positive values

- implements java.time.temporal.Temporal
- is immutable
- is created with .ofEpochSecond(), ofEpochMilli(), .now() or from an existing one with the methods withXXX(), plusXXX() or minusXXX()
- can be compared with equals(), isBefore() and isAfter()

> ChronoUnit values for Instant
>
> - NANOS
> - MICROS
> - MILLIS
> - SECONDS
> - MINUTES
> - HOURS
> - HALF_DAYS
> - DAYS

## Period

Period in years, months and days between 2 dates. Negative values are allowed representing that the 2 second date is the past comparing to the base date.

- implements java.time.temporal.TemporalAmount
- is immutable
- is created with .of(), ofDays(), ofMonths() and .ofYears() or from an existing one with the methods withXXX(), plusXXX() or minusXXX()

> ChronoUnit values for Period
>
> - DAYS
> - MONTHS
> - YEARS

## Duration

Duration in seconds and nanoseconds between 2 points in time.

- implements java.time.temporal.TemporalAmount
- is immutable
- is created with .of(), ofDays(), ofMonths() and .ofYears() or from the difference between 2 temporal objects.

> ChronoUnit values for Duration
>
> - NANOS
> - MICROS
> - MILLIS
> - SECONDS
> - MINUTES
> - HOURS
> - HALF_DAYS
> - DAYS

## ZoneId

Identifies a time zone.

- UTC / GMT / ZULU time are used interchangeably.

> java.util.TimeZone.getDefault() returns the system default ZoneId

### Region-based

Using format area/city ⇒ (Europe/London) 

### Offset % UTC

Offset % UTC / GMT represented by ZoneOffset class ⇒ (+02:00)

### Offset + base

Offset with UTC, GMT or UT prefix ⇒ (UTC+11:00)

## ZoneOffset

Represents a Time zone offset. 

## ZonedDateTime

Represents a DateTime with TimeZone information (absolute information).

It contains 3 parts: - date - time - time zone.

The information is stored at nanoseconds precision.

> Is a point in time in any offset with full time zone rules.

- we can create ZonedDateTime by calling now(), .of(localDate, localTime, zoneId), or from localDate.atStartOfDay(zoneId) / localDateTime.atZone(zoneId) / instant.atZone(zoneId)
- From a ZonedDateTime object, we can call .toLocalDate(), .toLocalTime() and .toLocalDateTime()

## OffsetDateTime

Represents a DateTime with an Offset from UTC (relative information).

It contains 3 parts: - date - time - time zone.

The information is stored at nanoseconds precision.

> Is a point in time in any offset.

## OffsetTime

Represents a time with an offset from UTC.


## Daylight Saving Time (DST)

Many countries advance the time by an hour  (or vice versa) to better use the light of the day (for economic reasons)

ZonedDateTime is completely aware of that.

# Parsing and Formatting

3 ways to format 

- predefined formats (ISO)
- local-specific formatters
- using custom patterns

## via Date and Time objects

LocalDate, LocalTime, LocalDateTime, ZonedDateTime, OffsetTime and OffsetDateTime all have 3 methods:

- format(DateTimeFormatter formatter)
- parse(CharSequence text)
- parse(CharSequence text, DateTimeFormatter formatter)

## via the DateTimeFormatter

- format(TemporalAccessor temporal)
- parse(CharSequence text)

> - if the date is missing information to match target format, an exception is thrown.
> 
> - if the custom format contains unrecognizable character, an exception is thrown.