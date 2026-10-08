//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties.g.dart';

/// ComDayCqDamCoreImplServletGuidLookupFilterProperties
///
/// Properties:
/// * [cqPeriodDamPeriodCorePeriodGuidlookupfilterPeriodEnabled] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletGuidLookupFilterProperties implements Built<ComDayCqDamCoreImplServletGuidLookupFilterProperties, ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.core.guidlookupfilter.enabled')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodCorePeriodGuidlookupfilterPeriodEnabled;

  ComDayCqDamCoreImplServletGuidLookupFilterProperties._();

  factory ComDayCqDamCoreImplServletGuidLookupFilterProperties([void updates(ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletGuidLookupFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletGuidLookupFilterProperties> get serializer => _$ComDayCqDamCoreImplServletGuidLookupFilterPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletGuidLookupFilterPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletGuidLookupFilterProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletGuidLookupFilterProperties, _$ComDayCqDamCoreImplServletGuidLookupFilterProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletGuidLookupFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletGuidLookupFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodCorePeriodGuidlookupfilterPeriodEnabled != null) {
      yield r'cq.dam.core.guidlookupfilter.enabled';
      yield serializers.serialize(
        object.cqPeriodDamPeriodCorePeriodGuidlookupfilterPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletGuidLookupFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.core.guidlookupfilter.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodCorePeriodGuidlookupfilterPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletGuidLookupFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder();
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

