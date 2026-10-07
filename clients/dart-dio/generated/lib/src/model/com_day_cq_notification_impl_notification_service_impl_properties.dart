//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_notification_impl_notification_service_impl_properties.g.dart';

/// ComDayCqNotificationImplNotificationServiceImplProperties
///
/// Properties:
/// * [eventPeriodFilter] 
@BuiltValue()
abstract class ComDayCqNotificationImplNotificationServiceImplProperties implements Built<ComDayCqNotificationImplNotificationServiceImplProperties, ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.filter')
  ConfigNodePropertyString? get eventPeriodFilter;

  ComDayCqNotificationImplNotificationServiceImplProperties._();

  factory ComDayCqNotificationImplNotificationServiceImplProperties([void updates(ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder b)]) = _$ComDayCqNotificationImplNotificationServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqNotificationImplNotificationServiceImplProperties> get serializer => _$ComDayCqNotificationImplNotificationServiceImplPropertiesSerializer();
}

class _$ComDayCqNotificationImplNotificationServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqNotificationImplNotificationServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqNotificationImplNotificationServiceImplProperties, _$ComDayCqNotificationImplNotificationServiceImplProperties];

  @override
  final String wireName = r'ComDayCqNotificationImplNotificationServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqNotificationImplNotificationServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventPeriodFilter != null) {
      yield r'event.filter';
      yield serializers.serialize(
        object.eventPeriodFilter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqNotificationImplNotificationServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event.filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.eventPeriodFilter.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqNotificationImplNotificationServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder();
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

