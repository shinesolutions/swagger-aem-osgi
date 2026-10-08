//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o_properties.g.dart';

/// ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties
///
/// Properties:
/// * [fieldWhitelist] 
@BuiltValue()
abstract class ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties implements Built<ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties, ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder> {
  @BuiltValueField(wireName: r'fieldWhitelist')
  ConfigNodePropertyArray? get fieldWhitelist;

  ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties._();

  factory ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties([void updates(ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder b)]) = _$ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties> get serializer => _$ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesSerializer();
}

class _$ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties, _$ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties];

  @override
  final String wireName = r'ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fieldWhitelist != null) {
      yield r'fieldWhitelist';
      yield serializers.serialize(
        object.fieldWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'fieldWhitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.fieldWhitelist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder();
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

