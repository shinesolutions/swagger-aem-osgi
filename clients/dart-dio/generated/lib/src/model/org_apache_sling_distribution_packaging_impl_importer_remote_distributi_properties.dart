//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_packaging_impl_importer_remote_distributi_properties.g.dart';

/// OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties
///
/// Properties:
/// * [name] 
/// * [endpoints] 
/// * [transportSecretProviderPeriodTarget] 
@BuiltValue()
abstract class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties implements Built<OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties, OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'endpoints')
  ConfigNodePropertyArray? get endpoints;

  @BuiltValueField(wireName: r'transportSecretProvider.target')
  ConfigNodePropertyString? get transportSecretProviderPeriodTarget;

  OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties._();

  factory OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties([void updates(OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder b)]) = _$OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties> get serializer => _$OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesSerializer();
}

class _$OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties, _$OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.endpoints != null) {
      yield r'endpoints';
      yield serializers.serialize(
        object.endpoints,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.transportSecretProviderPeriodTarget != null) {
      yield r'transportSecretProvider.target';
      yield serializers.serialize(
        object.transportSecretProviderPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.name.replace(valueDes);
          break;
        case r'endpoints':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.endpoints.replace(valueDes);
          break;
        case r'transportSecretProvider.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.transportSecretProviderPeriodTarget.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder();
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

