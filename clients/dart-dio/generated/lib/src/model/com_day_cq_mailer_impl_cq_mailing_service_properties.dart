//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_mailer_impl_cq_mailing_service_properties.g.dart';

/// ComDayCqMailerImplCqMailingServiceProperties
///
/// Properties:
/// * [maxPeriodRecipientPeriodCount] 
@BuiltValue()
abstract class ComDayCqMailerImplCqMailingServiceProperties implements Built<ComDayCqMailerImplCqMailingServiceProperties, ComDayCqMailerImplCqMailingServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'max.recipient.count')
  ConfigNodePropertyString? get maxPeriodRecipientPeriodCount;

  ComDayCqMailerImplCqMailingServiceProperties._();

  factory ComDayCqMailerImplCqMailingServiceProperties([void updates(ComDayCqMailerImplCqMailingServicePropertiesBuilder b)]) = _$ComDayCqMailerImplCqMailingServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqMailerImplCqMailingServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqMailerImplCqMailingServiceProperties> get serializer => _$ComDayCqMailerImplCqMailingServicePropertiesSerializer();
}

class _$ComDayCqMailerImplCqMailingServicePropertiesSerializer implements PrimitiveSerializer<ComDayCqMailerImplCqMailingServiceProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqMailerImplCqMailingServiceProperties, _$ComDayCqMailerImplCqMailingServiceProperties];

  @override
  final String wireName = r'ComDayCqMailerImplCqMailingServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqMailerImplCqMailingServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxPeriodRecipientPeriodCount != null) {
      yield r'max.recipient.count';
      yield serializers.serialize(
        object.maxPeriodRecipientPeriodCount,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqMailerImplCqMailingServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqMailerImplCqMailingServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'max.recipient.count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.maxPeriodRecipientPeriodCount.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqMailerImplCqMailingServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqMailerImplCqMailingServicePropertiesBuilder();
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

