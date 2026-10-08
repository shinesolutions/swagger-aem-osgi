//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties.g.dart';

/// ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties
///
/// Properties:
/// * [pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault] 
/// * [pagePeriodInfoPeriodProviderPeriodPropertyPeriodName] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties implements Built<ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties, ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'page.info.provider.property.regex.default')
  ConfigNodePropertyString? get pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault;

  @BuiltValueField(wireName: r'page.info.provider.property.name')
  ConfigNodePropertyString? get pagePeriodInfoPeriodProviderPeriodPropertyPeriodName;

  ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties._();

  factory ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties([void updates(ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties> get serializer => _$ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties, _$ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault != null) {
      yield r'page.info.provider.property.regex.default';
      yield serializers.serialize(
        object.pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.pagePeriodInfoPeriodProviderPeriodPropertyPeriodName != null) {
      yield r'page.info.provider.property.name';
      yield serializers.serialize(
        object.pagePeriodInfoPeriodProviderPeriodPropertyPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'page.info.provider.property.regex.default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault.replace(valueDes);
          break;
        case r'page.info.provider.property.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pagePeriodInfoPeriodProviderPeriodPropertyPeriodName.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder();
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

