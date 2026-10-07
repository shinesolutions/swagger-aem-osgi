//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_properties.g.dart';

/// ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties
///
/// Properties:
/// * [fieldWhitelist] 
@BuiltValue()
abstract class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties implements Built<ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties, ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder> {
  @BuiltValueField(wireName: r'fieldWhitelist')
  ConfigNodePropertyArray? get fieldWhitelist;

  ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties._();

  factory ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties([void updates(ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder b)]) = _$ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties> get serializer => _$ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesSerializer();
}

class _$ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties, _$ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties];

  @override
  final String wireName = r'ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties object, {
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
    ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder result,
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
  ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder();
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

