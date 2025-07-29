import SwiftUI
import ComposeApp

@main
struct iOSApp: App {

    init() {
        KoinInitializer_iosKt.doInit()
    }

    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
