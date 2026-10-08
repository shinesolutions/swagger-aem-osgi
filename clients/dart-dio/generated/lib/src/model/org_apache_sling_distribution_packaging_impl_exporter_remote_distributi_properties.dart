//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_packaging_impl_exporter_remote_distributi_properties.g.dart';

/// OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties
///
/// Properties:
/// * [name] 
/// * [endpoints] 
/// * [pullPeriodItems] 
/// * [packageBuilderPeriodTarget] 
/// * [transportSecretProviderPeriodTarget] 
@BuiltValue()
abstract class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties implements Built<OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties, OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'endpoints')
  ConfigNodePropertyArray? get endpoints;

  @BuiltValueField(wireName: r'pull.items')
  ConfigNodePropertyInteger? get pullPeriodItems;

  @BuiltValueField(wireName: r'packageBuilder.target')
  ConfigNodePropertyString? get packageBuilderPeriodTarget;

  @BuiltValueField(wireName: r'transportSecretProvider.target')
  ConfigNodePropertyString? get transportSecretProviderPeriodTarget;

  OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties._();

  factory OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties([void updates(OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder b)]) = _$OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties> get serializer => _$OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesSerializer();
}

class _$OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties, _$OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties object, {
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
    if (object.pullPeriodItems != null) {
      yield r'pull.items';
      yield serializers.serialize(
        object.pullPeriodItems,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.packageBuilderPeriodTarget != null) {
      yield r'packageBuilder.target';
      yield serializers.serialize(
        object.packageBuilderPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
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
    OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder result,
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
        case r'pull.items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.pullPeriodItems.replace(valueDes);
          break;
        case r'packageBuilder.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.packageBuilderPeriodTarget.replace(valueDes);
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
  OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder();
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

