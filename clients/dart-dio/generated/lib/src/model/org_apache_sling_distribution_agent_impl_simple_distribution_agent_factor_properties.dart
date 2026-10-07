//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties.g.dart';

/// OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties
///
/// Properties:
/// * [name] 
/// * [title] 
/// * [details] 
/// * [enabled] 
/// * [serviceName] 
/// * [logPeriodLevel] 
/// * [queuePeriodProcessingPeriodEnabled] 
/// * [packageExporterPeriodTarget] 
/// * [packageImporterPeriodTarget] 
/// * [requestAuthorizationStrategyPeriodTarget] 
/// * [triggersPeriodTarget] 
@BuiltValue()
abstract class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties implements Built<OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties, OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'title')
  ConfigNodePropertyString? get title;

  @BuiltValueField(wireName: r'details')
  ConfigNodePropertyString? get details;

  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'serviceName')
  ConfigNodePropertyString? get serviceName;

  @BuiltValueField(wireName: r'log.level')
  ConfigNodePropertyDropDown? get logPeriodLevel;

  @BuiltValueField(wireName: r'queue.processing.enabled')
  ConfigNodePropertyBoolean? get queuePeriodProcessingPeriodEnabled;

  @BuiltValueField(wireName: r'packageExporter.target')
  ConfigNodePropertyString? get packageExporterPeriodTarget;

  @BuiltValueField(wireName: r'packageImporter.target')
  ConfigNodePropertyString? get packageImporterPeriodTarget;

  @BuiltValueField(wireName: r'requestAuthorizationStrategy.target')
  ConfigNodePropertyString? get requestAuthorizationStrategyPeriodTarget;

  @BuiltValueField(wireName: r'triggers.target')
  ConfigNodePropertyString? get triggersPeriodTarget;

  OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties._();

  factory OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties([void updates(OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder b)]) = _$OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties> get serializer => _$OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesSerializer();
}

class _$OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties, _$OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.details != null) {
      yield r'details';
      yield serializers.serialize(
        object.details,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.serviceName != null) {
      yield r'serviceName';
      yield serializers.serialize(
        object.serviceName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.logPeriodLevel != null) {
      yield r'log.level';
      yield serializers.serialize(
        object.logPeriodLevel,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.queuePeriodProcessingPeriodEnabled != null) {
      yield r'queue.processing.enabled';
      yield serializers.serialize(
        object.queuePeriodProcessingPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.packageExporterPeriodTarget != null) {
      yield r'packageExporter.target';
      yield serializers.serialize(
        object.packageExporterPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.packageImporterPeriodTarget != null) {
      yield r'packageImporter.target';
      yield serializers.serialize(
        object.packageImporterPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.requestAuthorizationStrategyPeriodTarget != null) {
      yield r'requestAuthorizationStrategy.target';
      yield serializers.serialize(
        object.requestAuthorizationStrategyPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.triggersPeriodTarget != null) {
      yield r'triggers.target';
      yield serializers.serialize(
        object.triggersPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder result,
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
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.title.replace(valueDes);
          break;
        case r'details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.details.replace(valueDes);
          break;
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        case r'serviceName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.serviceName.replace(valueDes);
          break;
        case r'log.level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.logPeriodLevel.replace(valueDes);
          break;
        case r'queue.processing.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.queuePeriodProcessingPeriodEnabled.replace(valueDes);
          break;
        case r'packageExporter.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.packageExporterPeriodTarget.replace(valueDes);
          break;
        case r'packageImporter.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.packageImporterPeriodTarget.replace(valueDes);
          break;
        case r'requestAuthorizationStrategy.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.requestAuthorizationStrategyPeriodTarget.replace(valueDes);
          break;
        case r'triggers.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.triggersPeriodTarget.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder();
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

