//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_event_impl_jobs_job_consumer_manager_properties.g.dart';

/// OrgApacheSlingEventImplJobsJobConsumerManagerProperties
///
/// Properties:
/// * [orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist] 
/// * [jobPeriodConsumermanagerPeriodWhitelist] 
/// * [jobPeriodConsumermanagerPeriodBlacklist] 
@BuiltValue()
abstract class OrgApacheSlingEventImplJobsJobConsumerManagerProperties implements Built<OrgApacheSlingEventImplJobsJobConsumerManagerProperties, OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder> {
  @BuiltValueField(wireName: r'org.apache.sling.installer.configuration.persist')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist;

  @BuiltValueField(wireName: r'job.consumermanager.whitelist')
  ConfigNodePropertyArray? get jobPeriodConsumermanagerPeriodWhitelist;

  @BuiltValueField(wireName: r'job.consumermanager.blacklist')
  ConfigNodePropertyArray? get jobPeriodConsumermanagerPeriodBlacklist;

  OrgApacheSlingEventImplJobsJobConsumerManagerProperties._();

  factory OrgApacheSlingEventImplJobsJobConsumerManagerProperties([void updates(OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder b)]) = _$OrgApacheSlingEventImplJobsJobConsumerManagerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingEventImplJobsJobConsumerManagerProperties> get serializer => _$OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesSerializer();
}

class _$OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingEventImplJobsJobConsumerManagerProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingEventImplJobsJobConsumerManagerProperties, _$OrgApacheSlingEventImplJobsJobConsumerManagerProperties];

  @override
  final String wireName = r'OrgApacheSlingEventImplJobsJobConsumerManagerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingEventImplJobsJobConsumerManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist != null) {
      yield r'org.apache.sling.installer.configuration.persist';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.jobPeriodConsumermanagerPeriodWhitelist != null) {
      yield r'job.consumermanager.whitelist';
      yield serializers.serialize(
        object.jobPeriodConsumermanagerPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.jobPeriodConsumermanagerPeriodBlacklist != null) {
      yield r'job.consumermanager.blacklist';
      yield serializers.serialize(
        object.jobPeriodConsumermanagerPeriodBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingEventImplJobsJobConsumerManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'org.apache.sling.installer.configuration.persist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist.replace(valueDes);
          break;
        case r'job.consumermanager.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.jobPeriodConsumermanagerPeriodWhitelist.replace(valueDes);
          break;
        case r'job.consumermanager.blacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.jobPeriodConsumermanagerPeriodBlacklist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingEventImplJobsJobConsumerManagerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder();
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

