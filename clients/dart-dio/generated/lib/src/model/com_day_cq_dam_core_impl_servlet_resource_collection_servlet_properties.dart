//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties.g.dart';

/// ComDayCqDamCoreImplServletResourceCollectionServletProperties
///
/// Properties:
/// * [slingPeriodServletPeriodResourceTypes] 
/// * [slingPeriodServletPeriodMethods] 
/// * [slingPeriodServletPeriodSelectors] 
/// * [downloadPeriodConfig] 
/// * [viewPeriodSelector] 
/// * [sendEmail] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletResourceCollectionServletProperties implements Built<ComDayCqDamCoreImplServletResourceCollectionServletProperties, ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.servlet.resourceTypes')
  ConfigNodePropertyArray? get slingPeriodServletPeriodResourceTypes;

  @BuiltValueField(wireName: r'sling.servlet.methods')
  ConfigNodePropertyString? get slingPeriodServletPeriodMethods;

  @BuiltValueField(wireName: r'sling.servlet.selectors')
  ConfigNodePropertyString? get slingPeriodServletPeriodSelectors;

  @BuiltValueField(wireName: r'download.config')
  ConfigNodePropertyString? get downloadPeriodConfig;

  @BuiltValueField(wireName: r'view.selector')
  ConfigNodePropertyString? get viewPeriodSelector;

  @BuiltValueField(wireName: r'send_email')
  ConfigNodePropertyBoolean? get sendEmail;

  ComDayCqDamCoreImplServletResourceCollectionServletProperties._();

  factory ComDayCqDamCoreImplServletResourceCollectionServletProperties([void updates(ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletResourceCollectionServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletResourceCollectionServletProperties> get serializer => _$ComDayCqDamCoreImplServletResourceCollectionServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletResourceCollectionServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletResourceCollectionServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletResourceCollectionServletProperties, _$ComDayCqDamCoreImplServletResourceCollectionServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletResourceCollectionServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletResourceCollectionServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodServletPeriodResourceTypes != null) {
      yield r'sling.servlet.resourceTypes';
      yield serializers.serialize(
        object.slingPeriodServletPeriodResourceTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.slingPeriodServletPeriodMethods != null) {
      yield r'sling.servlet.methods';
      yield serializers.serialize(
        object.slingPeriodServletPeriodMethods,
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
    if (object.downloadPeriodConfig != null) {
      yield r'download.config';
      yield serializers.serialize(
        object.downloadPeriodConfig,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.viewPeriodSelector != null) {
      yield r'view.selector';
      yield serializers.serialize(
        object.viewPeriodSelector,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.sendEmail != null) {
      yield r'send_email';
      yield serializers.serialize(
        object.sendEmail,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletResourceCollectionServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.servlet.resourceTypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodResourceTypes.replace(valueDes);
          break;
        case r'sling.servlet.methods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodMethods.replace(valueDes);
          break;
        case r'sling.servlet.selectors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodSelectors.replace(valueDes);
          break;
        case r'download.config':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.downloadPeriodConfig.replace(valueDes);
          break;
        case r'view.selector':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.viewPeriodSelector.replace(valueDes);
          break;
        case r'send_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.sendEmail.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletResourceCollectionServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder();
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

