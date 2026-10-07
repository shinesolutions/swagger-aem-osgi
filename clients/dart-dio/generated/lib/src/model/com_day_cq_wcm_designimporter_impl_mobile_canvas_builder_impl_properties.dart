//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties.g.dart';

/// ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties
///
/// Properties:
/// * [filepattern] 
/// * [devicePeriodGroups] 
/// * [buildPeriodPagePeriodNodes] 
/// * [buildPeriodClientPeriodLibs] 
/// * [buildPeriodCanvasPeriodComponent] 
@BuiltValue()
abstract class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties implements Built<ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties, ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'filepattern')
  ConfigNodePropertyString? get filepattern;

  @BuiltValueField(wireName: r'device.groups')
  ConfigNodePropertyArray? get devicePeriodGroups;

  @BuiltValueField(wireName: r'build.page.nodes')
  ConfigNodePropertyBoolean? get buildPeriodPagePeriodNodes;

  @BuiltValueField(wireName: r'build.client.libs')
  ConfigNodePropertyBoolean? get buildPeriodClientPeriodLibs;

  @BuiltValueField(wireName: r'build.canvas.component')
  ConfigNodePropertyBoolean? get buildPeriodCanvasPeriodComponent;

  ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties._();

  factory ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties([void updates(ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder b)]) = _$ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties> get serializer => _$ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesSerializer();
}

class _$ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties, _$ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties];

  @override
  final String wireName = r'ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.filepattern != null) {
      yield r'filepattern';
      yield serializers.serialize(
        object.filepattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.devicePeriodGroups != null) {
      yield r'device.groups';
      yield serializers.serialize(
        object.devicePeriodGroups,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.buildPeriodPagePeriodNodes != null) {
      yield r'build.page.nodes';
      yield serializers.serialize(
        object.buildPeriodPagePeriodNodes,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.buildPeriodClientPeriodLibs != null) {
      yield r'build.client.libs';
      yield serializers.serialize(
        object.buildPeriodClientPeriodLibs,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.buildPeriodCanvasPeriodComponent != null) {
      yield r'build.canvas.component';
      yield serializers.serialize(
        object.buildPeriodCanvasPeriodComponent,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'filepattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.filepattern.replace(valueDes);
          break;
        case r'device.groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.devicePeriodGroups.replace(valueDes);
          break;
        case r'build.page.nodes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.buildPeriodPagePeriodNodes.replace(valueDes);
          break;
        case r'build.client.libs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.buildPeriodClientPeriodLibs.replace(valueDes);
          break;
        case r'build.canvas.component':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.buildPeriodCanvasPeriodComponent.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder();
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

