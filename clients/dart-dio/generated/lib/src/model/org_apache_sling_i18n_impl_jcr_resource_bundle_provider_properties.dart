//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties.g.dart';

/// OrgApacheSlingI18nImplJcrResourceBundleProviderProperties
///
/// Properties:
/// * [localePeriodDefault] 
/// * [preloadPeriodBundles] 
/// * [invalidationPeriodDelay] 
@BuiltValue()
abstract class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties implements Built<OrgApacheSlingI18nImplJcrResourceBundleProviderProperties, OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'locale.default')
  ConfigNodePropertyString? get localePeriodDefault;

  @BuiltValueField(wireName: r'preload.bundles')
  ConfigNodePropertyBoolean? get preloadPeriodBundles;

  @BuiltValueField(wireName: r'invalidation.delay')
  ConfigNodePropertyInteger? get invalidationPeriodDelay;

  OrgApacheSlingI18nImplJcrResourceBundleProviderProperties._();

  factory OrgApacheSlingI18nImplJcrResourceBundleProviderProperties([void updates(OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder b)]) = _$OrgApacheSlingI18nImplJcrResourceBundleProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingI18nImplJcrResourceBundleProviderProperties> get serializer => _$OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesSerializer();
}

class _$OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingI18nImplJcrResourceBundleProviderProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingI18nImplJcrResourceBundleProviderProperties, _$OrgApacheSlingI18nImplJcrResourceBundleProviderProperties];

  @override
  final String wireName = r'OrgApacheSlingI18nImplJcrResourceBundleProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingI18nImplJcrResourceBundleProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.localePeriodDefault != null) {
      yield r'locale.default';
      yield serializers.serialize(
        object.localePeriodDefault,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.preloadPeriodBundles != null) {
      yield r'preload.bundles';
      yield serializers.serialize(
        object.preloadPeriodBundles,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.invalidationPeriodDelay != null) {
      yield r'invalidation.delay';
      yield serializers.serialize(
        object.invalidationPeriodDelay,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingI18nImplJcrResourceBundleProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'locale.default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.localePeriodDefault.replace(valueDes);
          break;
        case r'preload.bundles':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.preloadPeriodBundles.replace(valueDes);
          break;
        case r'invalidation.delay':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.invalidationPeriodDelay.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingI18nImplJcrResourceBundleProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder();
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

