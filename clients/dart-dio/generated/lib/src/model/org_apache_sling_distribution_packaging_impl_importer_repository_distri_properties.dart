//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties.g.dart';

/// OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties
///
/// Properties:
/// * [name] 
/// * [servicePeriodName] 
/// * [path] 
/// * [privilegePeriodName] 
@BuiltValue()
abstract class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties implements Built<OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties, OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'service.name')
  ConfigNodePropertyString? get servicePeriodName;

  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  @BuiltValueField(wireName: r'privilege.name')
  ConfigNodePropertyString? get privilegePeriodName;

  OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties._();

  factory OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties([void updates(OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder b)]) = _$OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties> get serializer => _$OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesSerializer();
}

class _$OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties, _$OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.servicePeriodName != null) {
      yield r'service.name';
      yield serializers.serialize(
        object.servicePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.privilegePeriodName != null) {
      yield r'privilege.name';
      yield serializers.serialize(
        object.privilegePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder result,
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
        case r'service.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.servicePeriodName.replace(valueDes);
          break;
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.path.replace(valueDes);
          break;
        case r'privilege.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.privilegePeriodName.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder();
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

