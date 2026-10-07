//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_notification_email_impl_email_channel_properties.g.dart';

/// ComDayCqWcmNotificationEmailImplEmailChannelProperties
///
/// Properties:
/// * [emailPeriodFrom] 
@BuiltValue()
abstract class ComDayCqWcmNotificationEmailImplEmailChannelProperties implements Built<ComDayCqWcmNotificationEmailImplEmailChannelProperties, ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder> {
  @BuiltValueField(wireName: r'email.from')
  ConfigNodePropertyString? get emailPeriodFrom;

  ComDayCqWcmNotificationEmailImplEmailChannelProperties._();

  factory ComDayCqWcmNotificationEmailImplEmailChannelProperties([void updates(ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder b)]) = _$ComDayCqWcmNotificationEmailImplEmailChannelProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmNotificationEmailImplEmailChannelProperties> get serializer => _$ComDayCqWcmNotificationEmailImplEmailChannelPropertiesSerializer();
}

class _$ComDayCqWcmNotificationEmailImplEmailChannelPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmNotificationEmailImplEmailChannelProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmNotificationEmailImplEmailChannelProperties, _$ComDayCqWcmNotificationEmailImplEmailChannelProperties];

  @override
  final String wireName = r'ComDayCqWcmNotificationEmailImplEmailChannelProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmNotificationEmailImplEmailChannelProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.emailPeriodFrom != null) {
      yield r'email.from';
      yield serializers.serialize(
        object.emailPeriodFrom,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmNotificationEmailImplEmailChannelProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'email.from':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.emailPeriodFrom.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmNotificationEmailImplEmailChannelProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder();
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

