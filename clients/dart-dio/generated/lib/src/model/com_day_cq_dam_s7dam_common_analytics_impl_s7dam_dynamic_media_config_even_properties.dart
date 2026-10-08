//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_properties.g.dart';

/// ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties
///
/// Properties:
/// * [cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled] 
@BuiltValue()
abstract class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties implements Built<ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties, ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled;

  ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties._();

  factory ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties([void updates(ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder b)]) = _$ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties> get serializer => _$ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesSerializer();
}

class _$ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties, _$ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties];

  @override
  final String wireName = r'ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled != null) {
      yield r'cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled';
      yield serializers.serialize(
        object.cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder();
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

