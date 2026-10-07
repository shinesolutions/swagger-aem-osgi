//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties.g.dart';

/// ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties
///
/// Properties:
/// * [jdbcPeriodDriverPeriodClass] 
/// * [jdbcPeriodConnectionPeriodUri] 
/// * [jdbcPeriodUsername] 
/// * [jdbcPeriodPassword] 
/// * [jdbcPeriodValidationPeriodQuery] 
/// * [defaultPeriodReadonly] 
/// * [defaultPeriodAutocommit] 
/// * [poolPeriodSize] 
/// * [poolPeriodMaxPeriodWaitPeriodMsec] 
/// * [datasourcePeriodName] 
/// * [datasourcePeriodSvcPeriodProperties] 
@BuiltValue()
abstract class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties implements Built<ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties, ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'jdbc.driver.class')
  ConfigNodePropertyString? get jdbcPeriodDriverPeriodClass;

  @BuiltValueField(wireName: r'jdbc.connection.uri')
  ConfigNodePropertyString? get jdbcPeriodConnectionPeriodUri;

  @BuiltValueField(wireName: r'jdbc.username')
  ConfigNodePropertyString? get jdbcPeriodUsername;

  @BuiltValueField(wireName: r'jdbc.password')
  ConfigNodePropertyString? get jdbcPeriodPassword;

  @BuiltValueField(wireName: r'jdbc.validation.query')
  ConfigNodePropertyString? get jdbcPeriodValidationPeriodQuery;

  @BuiltValueField(wireName: r'default.readonly')
  ConfigNodePropertyBoolean? get defaultPeriodReadonly;

  @BuiltValueField(wireName: r'default.autocommit')
  ConfigNodePropertyBoolean? get defaultPeriodAutocommit;

  @BuiltValueField(wireName: r'pool.size')
  ConfigNodePropertyInteger? get poolPeriodSize;

  @BuiltValueField(wireName: r'pool.max.wait.msec')
  ConfigNodePropertyInteger? get poolPeriodMaxPeriodWaitPeriodMsec;

  @BuiltValueField(wireName: r'datasource.name')
  ConfigNodePropertyString? get datasourcePeriodName;

  @BuiltValueField(wireName: r'datasource.svc.properties')
  ConfigNodePropertyArray? get datasourcePeriodSvcPeriodProperties;

  ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties._();

  factory ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties([void updates(ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder b)]) = _$ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties> get serializer => _$ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesSerializer();
}

class _$ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesSerializer implements PrimitiveSerializer<ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties> {
  @override
  final Iterable<Type> types = const [ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties, _$ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties];

  @override
  final String wireName = r'ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.jdbcPeriodDriverPeriodClass != null) {
      yield r'jdbc.driver.class';
      yield serializers.serialize(
        object.jdbcPeriodDriverPeriodClass,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jdbcPeriodConnectionPeriodUri != null) {
      yield r'jdbc.connection.uri';
      yield serializers.serialize(
        object.jdbcPeriodConnectionPeriodUri,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jdbcPeriodUsername != null) {
      yield r'jdbc.username';
      yield serializers.serialize(
        object.jdbcPeriodUsername,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jdbcPeriodPassword != null) {
      yield r'jdbc.password';
      yield serializers.serialize(
        object.jdbcPeriodPassword,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jdbcPeriodValidationPeriodQuery != null) {
      yield r'jdbc.validation.query';
      yield serializers.serialize(
        object.jdbcPeriodValidationPeriodQuery,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultPeriodReadonly != null) {
      yield r'default.readonly';
      yield serializers.serialize(
        object.defaultPeriodReadonly,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.defaultPeriodAutocommit != null) {
      yield r'default.autocommit';
      yield serializers.serialize(
        object.defaultPeriodAutocommit,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.poolPeriodSize != null) {
      yield r'pool.size';
      yield serializers.serialize(
        object.poolPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.poolPeriodMaxPeriodWaitPeriodMsec != null) {
      yield r'pool.max.wait.msec';
      yield serializers.serialize(
        object.poolPeriodMaxPeriodWaitPeriodMsec,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.datasourcePeriodName != null) {
      yield r'datasource.name';
      yield serializers.serialize(
        object.datasourcePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.datasourcePeriodSvcPeriodProperties != null) {
      yield r'datasource.svc.properties';
      yield serializers.serialize(
        object.datasourcePeriodSvcPeriodProperties,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'jdbc.driver.class':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jdbcPeriodDriverPeriodClass.replace(valueDes);
          break;
        case r'jdbc.connection.uri':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jdbcPeriodConnectionPeriodUri.replace(valueDes);
          break;
        case r'jdbc.username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jdbcPeriodUsername.replace(valueDes);
          break;
        case r'jdbc.password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jdbcPeriodPassword.replace(valueDes);
          break;
        case r'jdbc.validation.query':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jdbcPeriodValidationPeriodQuery.replace(valueDes);
          break;
        case r'default.readonly':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.defaultPeriodReadonly.replace(valueDes);
          break;
        case r'default.autocommit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.defaultPeriodAutocommit.replace(valueDes);
          break;
        case r'pool.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.poolPeriodSize.replace(valueDes);
          break;
        case r'pool.max.wait.msec':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.poolPeriodMaxPeriodWaitPeriodMsec.replace(valueDes);
          break;
        case r'datasource.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.datasourcePeriodName.replace(valueDes);
          break;
        case r'datasource.svc.properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.datasourcePeriodSvcPeriodProperties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder();
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

