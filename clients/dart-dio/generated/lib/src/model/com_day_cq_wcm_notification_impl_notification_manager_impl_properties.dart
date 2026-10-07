//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_notification_impl_notification_manager_impl_properties.g.dart';

/// ComDayCqWcmNotificationImplNotificationManagerImplProperties
///
/// Properties:
/// * [eventPeriodTopics] 
@BuiltValue()
abstract class ComDayCqWcmNotificationImplNotificationManagerImplProperties implements Built<ComDayCqWcmNotificationImplNotificationManagerImplProperties, ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.topics')
  ConfigNodePropertyArray? get eventPeriodTopics;

  ComDayCqWcmNotificationImplNotificationManagerImplProperties._();

  factory ComDayCqWcmNotificationImplNotificationManagerImplProperties([void updates(ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder b)]) = _$ComDayCqWcmNotificationImplNotificationManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmNotificationImplNotificationManagerImplProperties> get serializer => _$ComDayCqWcmNotificationImplNotificationManagerImplPropertiesSerializer();
}

class _$ComDayCqWcmNotificationImplNotificationManagerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmNotificationImplNotificationManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmNotificationImplNotificationManagerImplProperties, _$ComDayCqWcmNotificationImplNotificationManagerImplProperties];

  @override
  final String wireName = r'ComDayCqWcmNotificationImplNotificationManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmNotificationImplNotificationManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventPeriodTopics != null) {
      yield r'event.topics';
      yield serializers.serialize(
        object.eventPeriodTopics,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmNotificationImplNotificationManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event.topics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.eventPeriodTopics.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmNotificationImplNotificationManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder();
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

