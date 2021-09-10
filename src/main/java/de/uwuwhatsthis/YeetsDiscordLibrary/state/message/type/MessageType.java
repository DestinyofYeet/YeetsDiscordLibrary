package de.uwuwhatsthis.YeetsDiscordLibrary.state.message.type;

public enum MessageType {
    DEFAULT(0), RECIPIENT_ADD(1), RECIPIENT_REMOVE(2), CALL(3), CHANNEL_NAME_CHANGE(4),
    CHANNEL_ICON_CHANGE(5), CHANNEL_PINNED_MESSAGE(6), GUILD_MEMBER_JOIN(7), USER_PREMIUM_GUILD_SUBSCRIPTION(8),
    USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1(9), USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2(10), USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3(11),
    CHANNEL_FOLLOW_ADD(12), GUILD_DISCOVERY_DISQUALIFIED(14), GUILD_DISCOVERY_REQUALIFIED(15), GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING(16),
    GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING(17), THREAD_CREATED(18), REPLY(19), APPLICATION_COMMAND(20), THREAD_STARTER_MESSAGE(21),
    GUILD_INVITE_REMINDER(22);

    private final int value;

    MessageType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static MessageType getFromValue(int value){
        for (MessageType messageType : values()) {
            if (messageType.getValue() == value) return messageType;
        }

        return null;
    }
}
