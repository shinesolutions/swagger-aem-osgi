//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_notifications_impl_notification_manager_impl_properties.g.dart';

/// ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties
///
/// Properties:
/// * [maxPeriodUnreadPeriodNotificationPeriodCount] 
@BuiltValue()
abstract class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties implements Built<ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties, ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'max.unread.notification.count')
  ConfigNodePropertyInteger? get maxPeriodUnreadPeriodNotificationPeriodCount;

  ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties._();

  factory ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties([void updates(ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder b)]) = _$ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties> get serializer => _$ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesSerializer();
}

class _$ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties, _$ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxPeriodUnreadPeriodNotificationPeriodCount != null) {
      yield r'max.unread.notification.count';
      yield serializers.serialize(
        object.maxPeriodUnreadPeriodNotificationPeriodCount,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'max.unread.notification.count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxPeriodUnreadPeriodNotificationPeriodCount.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

