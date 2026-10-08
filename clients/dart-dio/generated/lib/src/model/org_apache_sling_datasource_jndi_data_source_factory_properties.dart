//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_datasource_jndi_data_source_factory_properties.g.dart';

/// OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
///
/// Properties:
/// * [datasourcePeriodName] 
/// * [datasourcePeriodSvcPeriodPropPeriodName] 
/// * [datasourcePeriodJndiPeriodName] 
/// * [jndiPeriodProperties] 
@BuiltValue()
abstract class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties implements Built<OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties, OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'datasource.name')
  ConfigNodePropertyString? get datasourcePeriodName;

  @BuiltValueField(wireName: r'datasource.svc.prop.name')
  ConfigNodePropertyString? get datasourcePeriodSvcPeriodPropPeriodName;

  @BuiltValueField(wireName: r'datasource.jndi.name')
  ConfigNodePropertyString? get datasourcePeriodJndiPeriodName;

  @BuiltValueField(wireName: r'jndi.properties')
  ConfigNodePropertyArray? get jndiPeriodProperties;

  OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties._();

  factory OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties([void updates(OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder b)]) = _$OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties> get serializer => _$OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesSerializer();
}

class _$OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties, _$OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties];

  @override
  final String wireName = r'OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.datasourcePeriodName != null) {
      yield r'datasource.name';
      yield serializers.serialize(
        object.datasourcePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.datasourcePeriodSvcPeriodPropPeriodName != null) {
      yield r'datasource.svc.prop.name';
      yield serializers.serialize(
        object.datasourcePeriodSvcPeriodPropPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.datasourcePeriodJndiPeriodName != null) {
      yield r'datasource.jndi.name';
      yield serializers.serialize(
        object.datasourcePeriodJndiPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jndiPeriodProperties != null) {
      yield r'jndi.properties';
      yield serializers.serialize(
        object.jndiPeriodProperties,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'datasource.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.datasourcePeriodName.replace(valueDes);
          break;
        case r'datasource.svc.prop.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.datasourcePeriodSvcPeriodPropPeriodName.replace(valueDes);
          break;
        case r'datasource.jndi.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.datasourcePeriodJndiPeriodName.replace(valueDes);
          break;
        case r'jndi.properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.jndiPeriodProperties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder();
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

