//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check_properties.g.dart';

/// ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties
///
/// Properties:
/// * [hcPeriodTags] 
@BuiltValue()
abstract class ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties implements Built<ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties, ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties._();

  factory ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties([void updates(ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder b)]) = _$ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties> get serializer => _$ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesSerializer();
}

class _$ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties, _$ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties object, {
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
    ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder result,
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
  ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder();
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

