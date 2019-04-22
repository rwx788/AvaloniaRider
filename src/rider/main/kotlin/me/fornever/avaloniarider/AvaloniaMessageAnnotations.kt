package me.fornever.avaloniarider.me.fornever.avaloniarider

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class AvaloniaIncomingMessage(val uuid: String)

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class AvaloniaOutgoingMessage(val uuid: String)
