//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties.g.dart';

/// ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties
///
/// Properties:
/// * [everyoneLimit] 
/// * [priority] 
@BuiltValue()
abstract class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties implements Built<ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties, ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder> {
  @BuiltValueField(wireName: r'everyoneLimit')
  ConfigNodePropertyInteger? get everyoneLimit;

  @BuiltValueField(wireName: r'priority')
  ConfigNodePropertyInteger? get priority;

  ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties._();

  factory ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties([void updates(ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder b)]) = _$ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties> get serializer => _$ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesSerializer();
}

class _$ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties, _$ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties];

  @override
  final String wireName = r'ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.everyoneLimit != null) {
      yield r'everyoneLimit';
      yield serializers.serialize(
        object.everyoneLimit,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.priority != null) {
      yield r'priority';
      yield serializers.serialize(
        object.priority,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'everyoneLimit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.everyoneLimit.replace(valueDes);
          break;
        case r'priority':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.priority.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder();
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

