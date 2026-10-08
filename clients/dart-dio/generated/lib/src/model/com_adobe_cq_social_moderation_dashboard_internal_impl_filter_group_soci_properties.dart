//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties.g.dart';

/// ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties
///
/// Properties:
/// * [resourceTypePeriodFilters] 
/// * [priority] 
@BuiltValue()
abstract class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties implements Built<ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties, ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder> {
  @BuiltValueField(wireName: r'resourceType.filters')
  ConfigNodePropertyArray? get resourceTypePeriodFilters;

  @BuiltValueField(wireName: r'priority')
  ConfigNodePropertyInteger? get priority;

  ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties._();

  factory ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties([void updates(ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder b)]) = _$ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties> get serializer => _$ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesSerializer();
}

class _$ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties, _$ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties];

  @override
  final String wireName = r'ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties object, {
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
    ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder result,
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
  ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder();
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

