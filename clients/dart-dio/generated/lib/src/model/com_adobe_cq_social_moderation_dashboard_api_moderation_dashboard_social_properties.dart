//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties.g.dart';

/// ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties
///
/// Properties:
/// * [priority] 
@BuiltValue()
abstract class ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties implements Built<ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties, ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder> {
  @BuiltValueField(wireName: r'priority')
  ConfigNodePropertyInteger? get priority;

  ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties._();

  factory ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties([void updates(ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder b)]) = _$ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties> get serializer => _$ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesSerializer();
}

class _$ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties, _$ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties];

  @override
  final String wireName = r'ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties object, {
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
    ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder result,
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
  ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder();
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

