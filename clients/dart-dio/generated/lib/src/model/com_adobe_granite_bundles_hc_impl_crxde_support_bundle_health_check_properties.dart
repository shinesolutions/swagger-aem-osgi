//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check_properties.g.dart';

/// ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties
///
/// Properties:
/// * [hcPeriodTags] 
@BuiltValue()
abstract class ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties implements Built<ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties, ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties._();

  factory ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties([void updates(ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder b)]) = _$ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties> get serializer => _$ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesSerializer();
}

class _$ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties, _$ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder();
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

