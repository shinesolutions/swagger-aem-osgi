//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_packaging_impl_importer_local_distributio_properties.g.dart';

/// OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties
///
/// Properties:
/// * [name] 
/// * [packageBuilderPeriodTarget] 
@BuiltValue()
abstract class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties implements Built<OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties, OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'packageBuilder.target')
  ConfigNodePropertyString? get packageBuilderPeriodTarget;

  OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties._();

  factory OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties([void updates(OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder b)]) = _$OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties> get serializer => _$OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesSerializer();
}

class _$OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties, _$OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.packageBuilderPeriodTarget != null) {
      yield r'packageBuilder.target';
      yield serializers.serialize(
        object.packageBuilderPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder result,
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
        case r'packageBuilder.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.packageBuilderPeriodTarget.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder();
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

