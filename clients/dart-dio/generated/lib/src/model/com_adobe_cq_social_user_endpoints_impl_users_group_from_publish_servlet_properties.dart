//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties.g.dart';

/// ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties
///
/// Properties:
/// * [slingPeriodServletPeriodExtensions] 
/// * [slingPeriodServletPeriodPaths] 
/// * [slingPeriodServletPeriodMethods] 
@BuiltValue()
abstract class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties implements Built<ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties, ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.servlet.extensions')
  ConfigNodePropertyString? get slingPeriodServletPeriodExtensions;

  @BuiltValueField(wireName: r'sling.servlet.paths')
  ConfigNodePropertyString? get slingPeriodServletPeriodPaths;

  @BuiltValueField(wireName: r'sling.servlet.methods')
  ConfigNodePropertyString? get slingPeriodServletPeriodMethods;

  ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties._();

  factory ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties([void updates(ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder b)]) = _$ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties> get serializer => _$ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesSerializer();
}

class _$ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties, _$ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties];

  @override
  final String wireName = r'ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodServletPeriodExtensions != null) {
      yield r'sling.servlet.extensions';
      yield serializers.serialize(
        object.slingPeriodServletPeriodExtensions,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodServletPeriodPaths != null) {
      yield r'sling.servlet.paths';
      yield serializers.serialize(
        object.slingPeriodServletPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodServletPeriodMethods != null) {
      yield r'sling.servlet.methods';
      yield serializers.serialize(
        object.slingPeriodServletPeriodMethods,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.servlet.extensions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodExtensions.replace(valueDes);
          break;
        case r'sling.servlet.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodPaths.replace(valueDes);
          break;
        case r'sling.servlet.methods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodMethods.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder();
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

