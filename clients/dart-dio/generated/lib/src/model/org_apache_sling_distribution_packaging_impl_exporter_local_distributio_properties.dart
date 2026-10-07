//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_packaging_impl_exporter_local_distributio_properties.g.dart';

/// OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties
///
/// Properties:
/// * [name] 
/// * [packageBuilderPeriodTarget] 
@BuiltValue()
abstract class OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties implements Built<OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties, OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'packageBuilder.target')
  ConfigNodePropertyString? get packageBuilderPeriodTarget;

  OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties._();

  factory OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties([void updates(OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder b)]) = _$OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties> get serializer => _$OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesSerializer();
}

class _$OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties, _$OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties object, {
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
    OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder result,
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
  OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder();
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

