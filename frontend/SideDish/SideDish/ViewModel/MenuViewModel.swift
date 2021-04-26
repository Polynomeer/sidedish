
import Foundation

class MenuViewModel {
    private(set) var image: String
    private(set) var title: String
    private(set) var body: String
    private(set) var sPrice: String
    private(set) var nPrice: NSAttributedString
    private(set) var badges: [String]
    
    init(image: String, title: String, body: String, sPrice: String, nPrice: NSAttributedString, badges: [String]) {
        self.image = image
        self.title = title
        self.body = body
        self.sPrice = sPrice
        self.nPrice = nPrice
        self.badges = badges
    }
}

extension MenuViewModel: Hashable, Equatable {
    static func == (lhs: MenuViewModel, rhs: MenuViewModel) -> Bool {
        return lhs.image == rhs.image || lhs.title == rhs.title || lhs.body == rhs.body ||
            lhs.nPrice == rhs.nPrice || lhs.sPrice == rhs.sPrice || lhs.badges == rhs.badges
    }
    
    func hash(into hasher: inout Hasher) {
        hasher.combine(image)
        hasher.combine(title)
        hasher.combine(body)
        hasher.combine(nPrice)
        hasher.combine(sPrice)
        hasher.combine(badges)
    }
}
