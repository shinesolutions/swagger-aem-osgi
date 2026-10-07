//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties.g.dart';

/// ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties
///
/// Properties:
/// * [hcPeriodTags] 
/// * [ignoredPeriodBundles] 
@BuiltValue()
abstract class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties implements Built<ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties, ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  @BuiltValueField(wireName: r'ignored.bundles')
  ConfigNodePropertyArray? get ignoredPeriodBundles;

  ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties._();

  factory ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties([void updates(ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder b)]) = _$ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties> get serializer => _$ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesSerializer();
}

class _$ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties, _$ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.ignoredPeriodBundles != null) {
      yield r'ignored.bundles';
      yield serializers.serialize(
        object.ignoredPeriodBundles,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder result,
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
        case r'ignored.bundles':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.ignoredPeriodBundles.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder();
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

