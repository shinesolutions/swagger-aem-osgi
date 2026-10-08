//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties.g.dart';

/// ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties
///
/// Properties:
/// * [cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled] 
/// * [cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds] 
@BuiltValue()
abstract class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties implements Built<ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties, ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.social.content.fragments.services.enabled')
  ConfigNodePropertyBoolean? get cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled;

  @BuiltValueField(wireName: r'cq.social.content.fragments.services.waitTimeSeconds')
  ConfigNodePropertyInteger? get cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds;

  ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties._();

  factory ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties([void updates(ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder b)]) = _$ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties> get serializer => _$ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesSerializer();
}

class _$ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties, _$ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties];

  @override
  final String wireName = r'ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled != null) {
      yield r'cq.social.content.fragments.services.enabled';
      yield serializers.serialize(
        object.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds != null) {
      yield r'cq.social.content.fragments.services.waitTimeSeconds';
      yield serializers.serialize(
        object.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.social.content.fragments.services.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled.replace(valueDes);
          break;
        case r'cq.social.content.fragments.services.waitTimeSeconds':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder();
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

