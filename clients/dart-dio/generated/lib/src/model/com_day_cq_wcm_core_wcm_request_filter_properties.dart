//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_wcm_request_filter_properties.g.dart';

/// ComDayCqWcmCoreWCMRequestFilterProperties
///
/// Properties:
/// * [wcmfilterPeriodMode] 
@BuiltValue()
abstract class ComDayCqWcmCoreWCMRequestFilterProperties implements Built<ComDayCqWcmCoreWCMRequestFilterProperties, ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'wcmfilter.mode')
  ConfigNodePropertyDropDown? get wcmfilterPeriodMode;

  ComDayCqWcmCoreWCMRequestFilterProperties._();

  factory ComDayCqWcmCoreWCMRequestFilterProperties([void updates(ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder b)]) = _$ComDayCqWcmCoreWCMRequestFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreWCMRequestFilterProperties> get serializer => _$ComDayCqWcmCoreWCMRequestFilterPropertiesSerializer();
}

class _$ComDayCqWcmCoreWCMRequestFilterPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreWCMRequestFilterProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreWCMRequestFilterProperties, _$ComDayCqWcmCoreWCMRequestFilterProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreWCMRequestFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreWCMRequestFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.wcmfilterPeriodMode != null) {
      yield r'wcmfilter.mode';
      yield serializers.serialize(
        object.wcmfilterPeriodMode,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreWCMRequestFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'wcmfilter.mode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.wcmfilterPeriodMode.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreWCMRequestFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder();
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

