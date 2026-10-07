//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen_properties.g.dart';

/// ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties
///
/// Properties:
/// * [resourceTypePeriodFilters] 
/// * [priority] 
@BuiltValue()
abstract class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties implements Built<ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties, ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder> {
  @BuiltValueField(wireName: r'resourceType.filters')
  ConfigNodePropertyArray? get resourceTypePeriodFilters;

  @BuiltValueField(wireName: r'priority')
  ConfigNodePropertyInteger? get priority;

  ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties._();

  factory ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties([void updates(ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder b)]) = _$ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties> get serializer => _$ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesSerializer();
}

class _$ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties, _$ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties];

  @override
  final String wireName = r'ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.resourceTypePeriodFilters != null) {
      yield r'resourceType.filters';
      yield serializers.serialize(
        object.resourceTypePeriodFilters,
        specifiedType: const FullType(ConfigNodePropertyArray),
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
    ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'resourceType.filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.resourceTypePeriodFilters.replace(valueDes);
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
  ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder();
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

