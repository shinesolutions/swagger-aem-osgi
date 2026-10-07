//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_datasource_data_source_factory_properties.g.dart';

/// OrgApacheSlingDatasourceDataSourceFactoryProperties
///
/// Properties:
/// * [datasourcePeriodName] 
/// * [datasourcePeriodSvcPeriodPropPeriodName] 
/// * [driverClassName] 
/// * [url] 
/// * [username] 
/// * [password] 
/// * [defaultAutoCommit] 
/// * [defaultReadOnly] 
/// * [defaultTransactionIsolation] 
/// * [defaultCatalog] 
/// * [maxActive] 
/// * [maxIdle] 
/// * [minIdle] 
/// * [initialSize] 
/// * [maxWait] 
/// * [maxAge] 
/// * [testOnBorrow] 
/// * [testOnReturn] 
/// * [testWhileIdle] 
/// * [validationQuery] 
/// * [validationQueryTimeout] 
/// * [timeBetweenEvictionRunsMillis] 
/// * [minEvictableIdleTimeMillis] 
/// * [connectionProperties] 
/// * [initSQL] 
/// * [jdbcInterceptors] 
/// * [validationInterval] 
/// * [logValidationErrors] 
/// * [datasourcePeriodSvcPeriodProperties] 
@BuiltValue()
abstract class OrgApacheSlingDatasourceDataSourceFactoryProperties implements Built<OrgApacheSlingDatasourceDataSourceFactoryProperties, OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'datasource.name')
  ConfigNodePropertyString? get datasourcePeriodName;

  @BuiltValueField(wireName: r'datasource.svc.prop.name')
  ConfigNodePropertyString? get datasourcePeriodSvcPeriodPropPeriodName;

  @BuiltValueField(wireName: r'driverClassName')
  ConfigNodePropertyString? get driverClassName;

  @BuiltValueField(wireName: r'url')
  ConfigNodePropertyString? get url;

  @BuiltValueField(wireName: r'username')
  ConfigNodePropertyString? get username;

  @BuiltValueField(wireName: r'password')
  ConfigNodePropertyString? get password;

  @BuiltValueField(wireName: r'defaultAutoCommit')
  ConfigNodePropertyDropDown? get defaultAutoCommit;

  @BuiltValueField(wireName: r'defaultReadOnly')
  ConfigNodePropertyDropDown? get defaultReadOnly;

  @BuiltValueField(wireName: r'defaultTransactionIsolation')
  ConfigNodePropertyDropDown? get defaultTransactionIsolation;

  @BuiltValueField(wireName: r'defaultCatalog')
  ConfigNodePropertyString? get defaultCatalog;

  @BuiltValueField(wireName: r'maxActive')
  ConfigNodePropertyInteger? get maxActive;

  @BuiltValueField(wireName: r'maxIdle')
  ConfigNodePropertyInteger? get maxIdle;

  @BuiltValueField(wireName: r'minIdle')
  ConfigNodePropertyInteger? get minIdle;

  @BuiltValueField(wireName: r'initialSize')
  ConfigNodePropertyInteger? get initialSize;

  @BuiltValueField(wireName: r'maxWait')
  ConfigNodePropertyInteger? get maxWait;

  @BuiltValueField(wireName: r'maxAge')
  ConfigNodePropertyInteger? get maxAge;

  @BuiltValueField(wireName: r'testOnBorrow')
  ConfigNodePropertyBoolean? get testOnBorrow;

  @BuiltValueField(wireName: r'testOnReturn')
  ConfigNodePropertyBoolean? get testOnReturn;

  @BuiltValueField(wireName: r'testWhileIdle')
  ConfigNodePropertyBoolean? get testWhileIdle;

  @BuiltValueField(wireName: r'validationQuery')
  ConfigNodePropertyString? get validationQuery;

  @BuiltValueField(wireName: r'validationQueryTimeout')
  ConfigNodePropertyInteger? get validationQueryTimeout;

  @BuiltValueField(wireName: r'timeBetweenEvictionRunsMillis')
  ConfigNodePropertyInteger? get timeBetweenEvictionRunsMillis;

  @BuiltValueField(wireName: r'minEvictableIdleTimeMillis')
  ConfigNodePropertyInteger? get minEvictableIdleTimeMillis;

  @BuiltValueField(wireName: r'connectionProperties')
  ConfigNodePropertyString? get connectionProperties;

  @BuiltValueField(wireName: r'initSQL')
  ConfigNodePropertyString? get initSQL;

  @BuiltValueField(wireName: r'jdbcInterceptors')
  ConfigNodePropertyString? get jdbcInterceptors;

  @BuiltValueField(wireName: r'validationInterval')
  ConfigNodePropertyInteger? get validationInterval;

  @BuiltValueField(wireName: r'logValidationErrors')
  ConfigNodePropertyBoolean? get logValidationErrors;

  @BuiltValueField(wireName: r'datasource.svc.properties')
  ConfigNodePropertyArray? get datasourcePeriodSvcPeriodProperties;

  OrgApacheSlingDatasourceDataSourceFactoryProperties._();

  factory OrgApacheSlingDatasourceDataSourceFactoryProperties([void updates(OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder b)]) = _$OrgApacheSlingDatasourceDataSourceFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDatasourceDataSourceFactoryProperties> get serializer => _$OrgApacheSlingDatasourceDataSourceFactoryPropertiesSerializer();
}

class _$OrgApacheSlingDatasourceDataSourceFactoryPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDatasourceDataSourceFactoryProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDatasourceDataSourceFactoryProperties, _$OrgApacheSlingDatasourceDataSourceFactoryProperties];

  @override
  final String wireName = r'OrgApacheSlingDatasourceDataSourceFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDatasourceDataSourceFactoryProperties object, {
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
    if (object.driverClassName != null) {
      yield r'driverClassName';
      yield serializers.serialize(
        object.driverClassName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.url != null) {
      yield r'url';
      yield serializers.serialize(
        object.url,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.username != null) {
      yield r'username';
      yield serializers.serialize(
        object.username,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.password != null) {
      yield r'password';
      yield serializers.serialize(
        object.password,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultAutoCommit != null) {
      yield r'defaultAutoCommit';
      yield serializers.serialize(
        object.defaultAutoCommit,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.defaultReadOnly != null) {
      yield r'defaultReadOnly';
      yield serializers.serialize(
        object.defaultReadOnly,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.defaultTransactionIsolation != null) {
      yield r'defaultTransactionIsolation';
      yield serializers.serialize(
        object.defaultTransactionIsolation,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.defaultCatalog != null) {
      yield r'defaultCatalog';
      yield serializers.serialize(
        object.defaultCatalog,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.maxActive != null) {
      yield r'maxActive';
      yield serializers.serialize(
        object.maxActive,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxIdle != null) {
      yield r'maxIdle';
      yield serializers.serialize(
        object.maxIdle,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.minIdle != null) {
      yield r'minIdle';
      yield serializers.serialize(
        object.minIdle,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.initialSize != null) {
      yield r'initialSize';
      yield serializers.serialize(
        object.initialSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxWait != null) {
      yield r'maxWait';
      yield serializers.serialize(
        object.maxWait,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxAge != null) {
      yield r'maxAge';
      yield serializers.serialize(
        object.maxAge,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.testOnBorrow != null) {
      yield r'testOnBorrow';
      yield serializers.serialize(
        object.testOnBorrow,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.testOnReturn != null) {
      yield r'testOnReturn';
      yield serializers.serialize(
        object.testOnReturn,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.testWhileIdle != null) {
      yield r'testWhileIdle';
      yield serializers.serialize(
        object.testWhileIdle,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.validationQuery != null) {
      yield r'validationQuery';
      yield serializers.serialize(
        object.validationQuery,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.validationQueryTimeout != null) {
      yield r'validationQueryTimeout';
      yield serializers.serialize(
        object.validationQueryTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.timeBetweenEvictionRunsMillis != null) {
      yield r'timeBetweenEvictionRunsMillis';
      yield serializers.serialize(
        object.timeBetweenEvictionRunsMillis,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.minEvictableIdleTimeMillis != null) {
      yield r'minEvictableIdleTimeMillis';
      yield serializers.serialize(
        object.minEvictableIdleTimeMillis,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.connectionProperties != null) {
      yield r'connectionProperties';
      yield serializers.serialize(
        object.connectionProperties,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.initSQL != null) {
      yield r'initSQL';
      yield serializers.serialize(
        object.initSQL,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jdbcInterceptors != null) {
      yield r'jdbcInterceptors';
      yield serializers.serialize(
        object.jdbcInterceptors,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.validationInterval != null) {
      yield r'validationInterval';
      yield serializers.serialize(
        object.validationInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.logValidationErrors != null) {
      yield r'logValidationErrors';
      yield serializers.serialize(
        object.logValidationErrors,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
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
    OrgApacheSlingDatasourceDataSourceFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder result,
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
        case r'driverClassName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.driverClassName.replace(valueDes);
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.url.replace(valueDes);
          break;
        case r'username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.username.replace(valueDes);
          break;
        case r'password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.password.replace(valueDes);
          break;
        case r'defaultAutoCommit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.defaultAutoCommit.replace(valueDes);
          break;
        case r'defaultReadOnly':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.defaultReadOnly.replace(valueDes);
          break;
        case r'defaultTransactionIsolation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.defaultTransactionIsolation.replace(valueDes);
          break;
        case r'defaultCatalog':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultCatalog.replace(valueDes);
          break;
        case r'maxActive':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxActive.replace(valueDes);
          break;
        case r'maxIdle':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxIdle.replace(valueDes);
          break;
        case r'minIdle':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.minIdle.replace(valueDes);
          break;
        case r'initialSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.initialSize.replace(valueDes);
          break;
        case r'maxWait':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxWait.replace(valueDes);
          break;
        case r'maxAge':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxAge.replace(valueDes);
          break;
        case r'testOnBorrow':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.testOnBorrow.replace(valueDes);
          break;
        case r'testOnReturn':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.testOnReturn.replace(valueDes);
          break;
        case r'testWhileIdle':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.testWhileIdle.replace(valueDes);
          break;
        case r'validationQuery':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.validationQuery.replace(valueDes);
          break;
        case r'validationQueryTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.validationQueryTimeout.replace(valueDes);
          break;
        case r'timeBetweenEvictionRunsMillis':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.timeBetweenEvictionRunsMillis.replace(valueDes);
          break;
        case r'minEvictableIdleTimeMillis':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.minEvictableIdleTimeMillis.replace(valueDes);
          break;
        case r'connectionProperties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.connectionProperties.replace(valueDes);
          break;
        case r'initSQL':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.initSQL.replace(valueDes);
          break;
        case r'jdbcInterceptors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jdbcInterceptors.replace(valueDes);
          break;
        case r'validationInterval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.validationInterval.replace(valueDes);
          break;
        case r'logValidationErrors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.logValidationErrors.replace(valueDes);
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
  OrgApacheSlingDatasourceDataSourceFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder();
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

