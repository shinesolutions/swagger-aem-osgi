//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties.g.dart';

/// ComDayCqWcmFoundationFormsImplMailServletProperties
///
/// Properties:
/// * [slingPeriodServletPeriodResourceTypes] 
/// * [slingPeriodServletPeriodSelectors] 
/// * [resourcePeriodWhitelist] 
/// * [resourcePeriodBlacklist] 
@BuiltValue()
abstract class ComDayCqWcmFoundationFormsImplMailServletProperties implements Built<ComDayCqWcmFoundationFormsImplMailServletProperties, ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.servlet.resourceTypes')
  ConfigNodePropertyString? get slingPeriodServletPeriodResourceTypes;

  @BuiltValueField(wireName: r'sling.servlet.selectors')
  ConfigNodePropertyString? get slingPeriodServletPeriodSelectors;

  @BuiltValueField(wireName: r'resource.whitelist')
  ConfigNodePropertyArray? get resourcePeriodWhitelist;

  @BuiltValueField(wireName: r'resource.blacklist')
  ConfigNodePropertyString? get resourcePeriodBlacklist;

  ComDayCqWcmFoundationFormsImplMailServletProperties._();

  factory ComDayCqWcmFoundationFormsImplMailServletProperties([void updates(ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder b)]) = _$ComDayCqWcmFoundationFormsImplMailServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmFoundationFormsImplMailServletProperties> get serializer => _$ComDayCqWcmFoundationFormsImplMailServletPropertiesSerializer();
}

class _$ComDayCqWcmFoundationFormsImplMailServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmFoundationFormsImplMailServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmFoundationFormsImplMailServletProperties, _$ComDayCqWcmFoundationFormsImplMailServletProperties];

  @override
  final String wireName = r'ComDayCqWcmFoundationFormsImplMailServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmFoundationFormsImplMailServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodServletPeriodResourceTypes != null) {
      yield r'sling.servlet.resourceTypes';
      yield serializers.serialize(
        object.slingPeriodServletPeriodResourceTypes,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodServletPeriodSelectors != null) {
      yield r'sling.servlet.selectors';
      yield serializers.serialize(
        object.slingPeriodServletPeriodSelectors,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.resourcePeriodWhitelist != null) {
      yield r'resource.whitelist';
      yield serializers.serialize(
        object.resourcePeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.resourcePeriodBlacklist != null) {
      yield r'resource.blacklist';
      yield serializers.serialize(
        object.resourcePeriodBlacklist,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmFoundationFormsImplMailServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.servlet.resourceTypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodResourceTypes.replace(valueDes);
          break;
        case r'sling.servlet.selectors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodSelectors.replace(valueDes);
          break;
        case r'resource.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.resourcePeriodWhitelist.replace(valueDes);
          break;
        case r'resource.blacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.resourcePeriodBlacklist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmFoundationFormsImplMailServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder();
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

