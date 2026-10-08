//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_i18n_impl_jcr_resource_bundle_provider_info.g.dart';

/// OrgApacheSlingI18nImplJcrResourceBundleProviderInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
/// * [additionalProperties] 
/// * [bundleLocation] 
/// * [serviceLocation] 
@BuiltValue()
abstract class OrgApacheSlingI18nImplJcrResourceBundleProviderInfo implements Built<OrgApacheSlingI18nImplJcrResourceBundleProviderInfo, OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  OrgApacheSlingI18nImplJcrResourceBundleProviderProperties? get properties;

  @BuiltValueField(wireName: r'additionalProperties')
  String? get additionalProperties;

  @BuiltValueField(wireName: r'bundle_location')
  String? get bundleLocation;

  @BuiltValueField(wireName: r'service_location')
  String? get serviceLocation;

  OrgApacheSlingI18nImplJcrResourceBundleProviderInfo._();

  factory OrgApacheSlingI18nImplJcrResourceBundleProviderInfo([void updates(OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder b)]) = _$OrgApacheSlingI18nImplJcrResourceBundleProviderInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingI18nImplJcrResourceBundleProviderInfo> get serializer => _$OrgApacheSlingI18nImplJcrResourceBundleProviderInfoSerializer();
}

class _$OrgApacheSlingI18nImplJcrResourceBundleProviderInfoSerializer implements PrimitiveSerializer<OrgApacheSlingI18nImplJcrResourceBundleProviderInfo> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingI18nImplJcrResourceBundleProviderInfo, _$OrgApacheSlingI18nImplJcrResourceBundleProviderInfo];

  @override
  final String wireName = r'OrgApacheSlingI18nImplJcrResourceBundleProviderInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingI18nImplJcrResourceBundleProviderInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(OrgApacheSlingI18nImplJcrResourceBundleProviderProperties),
      );
    }
    if (object.additionalProperties != null) {
      yield r'additionalProperties';
      yield serializers.serialize(
        object.additionalProperties,
        specifiedType: const FullType(String),
      );
    }
    if (object.bundleLocation != null) {
      yield r'bundle_location';
      yield serializers.serialize(
        object.bundleLocation,
        specifiedType: const FullType(String),
      );
    }
    if (object.serviceLocation != null) {
      yield r'service_location';
      yield serializers.serialize(
        object.serviceLocation,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingI18nImplJcrResourceBundleProviderInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OrgApacheSlingI18nImplJcrResourceBundleProviderProperties),
          ) as OrgApacheSlingI18nImplJcrResourceBundleProviderProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        case r'additionalProperties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.additionalProperties = valueDes;
          break;
        case r'bundle_location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bundleLocation = valueDes;
          break;
        case r'service_location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.serviceLocation = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingI18nImplJcrResourceBundleProviderInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder();
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

