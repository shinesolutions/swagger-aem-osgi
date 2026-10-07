//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties.g.dart';

/// ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties
///
/// Properties:
/// * [maxRetry] 
/// * [fieldWhitelist] 
/// * [attachmentTypeBlacklist] 
@BuiltValue()
abstract class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties implements Built<ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties, ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder> {
  @BuiltValueField(wireName: r'MaxRetry')
  ConfigNodePropertyInteger? get maxRetry;

  @BuiltValueField(wireName: r'fieldWhitelist')
  ConfigNodePropertyArray? get fieldWhitelist;

  @BuiltValueField(wireName: r'attachmentTypeBlacklist')
  ConfigNodePropertyArray? get attachmentTypeBlacklist;

  ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties._();

  factory ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties([void updates(ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder b)]) = _$ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties> get serializer => _$ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesSerializer();
}

class _$ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties, _$ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxRetry != null) {
      yield r'MaxRetry';
      yield serializers.serialize(
        object.maxRetry,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.fieldWhitelist != null) {
      yield r'fieldWhitelist';
      yield serializers.serialize(
        object.fieldWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.attachmentTypeBlacklist != null) {
      yield r'attachmentTypeBlacklist';
      yield serializers.serialize(
        object.attachmentTypeBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'MaxRetry':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxRetry.replace(valueDes);
          break;
        case r'fieldWhitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.fieldWhitelist.replace(valueDes);
          break;
        case r'attachmentTypeBlacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.attachmentTypeBlacklist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder();
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

