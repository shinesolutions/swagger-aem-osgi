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

part 'org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_properties.g.dart';

/// OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties
///
/// Properties:
/// * [name] 
/// * [title] 
/// * [details] 
/// * [enabled] 
/// * [serviceName] 
/// * [logPeriodLevel] 
/// * [queuePeriodProcessingPeriodEnabled] 
/// * [packageExporterPeriodEndpoints] 
/// * [pullPeriodItems] 
/// * [httpPeriodConnPeriodTimeout] 
/// * [requestAuthorizationStrategyPeriodTarget] 
/// * [transportSecretProviderPeriodTarget] 
/// * [packageBuilderPeriodTarget] 
/// * [triggersPeriodTarget] 
@BuiltValue()
abstract class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties implements Built<OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties, OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder> {
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

  @BuiltValueField(wireName: r'packageExporter.endpoints')
  ConfigNodePropertyArray? get packageExporterPeriodEndpoints;

  @BuiltValueField(wireName: r'pull.items')
  ConfigNodePropertyInteger? get pullPeriodItems;

  @BuiltValueField(wireName: r'http.conn.timeout')
  ConfigNodePropertyInteger? get httpPeriodConnPeriodTimeout;

  @BuiltValueField(wireName: r'requestAuthorizationStrategy.target')
  ConfigNodePropertyString? get requestAuthorizationStrategyPeriodTarget;

  @BuiltValueField(wireName: r'transportSecretProvider.target')
  ConfigNodePropertyString? get transportSecretProviderPeriodTarget;

  @BuiltValueField(wireName: r'packageBuilder.target')
  ConfigNodePropertyString? get packageBuilderPeriodTarget;

  @BuiltValueField(wireName: r'triggers.target')
  ConfigNodePropertyString? get triggersPeriodTarget;

  OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties._();

  factory OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties([void updates(OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder b)]) = _$OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties> get serializer => _$OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesSerializer();
}

class _$OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties, _$OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties object, {
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
    if (object.packageExporterPeriodEndpoints != null) {
      yield r'packageExporter.endpoints';
      yield serializers.serialize(
        object.packageExporterPeriodEndpoints,
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
    if (object.httpPeriodConnPeriodTimeout != null) {
      yield r'http.conn.timeout';
      yield serializers.serialize(
        object.httpPeriodConnPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.requestAuthorizationStrategyPeriodTarget != null) {
      yield r'requestAuthorizationStrategy.target';
      yield serializers.serialize(
        object.requestAuthorizationStrategyPeriodTarget,
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
    if (object.packageBuilderPeriodTarget != null) {
      yield r'packageBuilder.target';
      yield serializers.serialize(
        object.packageBuilderPeriodTarget,
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
    OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder result,
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
        case r'packageExporter.endpoints':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.packageExporterPeriodEndpoints.replace(valueDes);
          break;
        case r'pull.items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.pullPeriodItems.replace(valueDes);
          break;
        case r'http.conn.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.httpPeriodConnPeriodTimeout.replace(valueDes);
          break;
        case r'requestAuthorizationStrategy.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.requestAuthorizationStrategyPeriodTarget.replace(valueDes);
          break;
        case r'transportSecretProvider.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.transportSecretProviderPeriodTarget.replace(valueDes);
          break;
        case r'packageBuilder.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.packageBuilderPeriodTarget.replace(valueDes);
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
  OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder();
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

