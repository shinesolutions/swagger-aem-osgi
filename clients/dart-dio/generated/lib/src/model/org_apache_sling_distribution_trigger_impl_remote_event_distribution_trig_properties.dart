//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties.g.dart';

/// OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties
///
/// Properties:
/// * [name] 
/// * [endpoint] 
/// * [transportSecretProviderPeriodTarget] 
@BuiltValue()
abstract class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties implements Built<OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties, OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'endpoint')
  ConfigNodePropertyString? get endpoint;

  @BuiltValueField(wireName: r'transportSecretProvider.target')
  ConfigNodePropertyString? get transportSecretProviderPeriodTarget;

  OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties._();

  factory OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties([void updates(OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder b)]) = _$OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties> get serializer => _$OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesSerializer();
}

class _$OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties, _$OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.endpoint != null) {
      yield r'endpoint';
      yield serializers.serialize(
        object.endpoint,
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
    OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder result,
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
        case r'endpoint':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.endpoint.replace(valueDes);
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
  OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder();
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

