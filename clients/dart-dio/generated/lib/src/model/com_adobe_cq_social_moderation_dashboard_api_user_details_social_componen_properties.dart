//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen_properties.g.dart';

/// ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties
///
/// Properties:
/// * [priority] 
@BuiltValue()
abstract class ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties implements Built<ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties, ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder> {
  @BuiltValueField(wireName: r'priority')
  ConfigNodePropertyInteger? get priority;

  ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties._();

  factory ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties([void updates(ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder b)]) = _$ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties> get serializer => _$ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesSerializer();
}

class _$ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties, _$ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties];

  @override
  final String wireName = r'ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder();
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

