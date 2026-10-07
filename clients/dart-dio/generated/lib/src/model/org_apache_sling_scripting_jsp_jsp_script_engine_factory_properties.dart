//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties.g.dart';

/// OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties
///
/// Properties:
/// * [jasperPeriodCompilerTargetVM] 
/// * [jasperPeriodCompilerSourceVM] 
/// * [jasperPeriodClassdebuginfo] 
/// * [jasperPeriodEnablePooling] 
/// * [jasperPeriodIeClassId] 
/// * [jasperPeriodGenStringAsCharArray] 
/// * [jasperPeriodKeepgenerated] 
/// * [jasperPeriodMappedfile] 
/// * [jasperPeriodTrimSpaces] 
/// * [jasperPeriodDisplaySourceFragments] 
/// * [defaultPeriodIsPeriodSession] 
@BuiltValue()
abstract class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties implements Built<OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties, OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'jasper.compilerTargetVM')
  ConfigNodePropertyString? get jasperPeriodCompilerTargetVM;

  @BuiltValueField(wireName: r'jasper.compilerSourceVM')
  ConfigNodePropertyString? get jasperPeriodCompilerSourceVM;

  @BuiltValueField(wireName: r'jasper.classdebuginfo')
  ConfigNodePropertyBoolean? get jasperPeriodClassdebuginfo;

  @BuiltValueField(wireName: r'jasper.enablePooling')
  ConfigNodePropertyBoolean? get jasperPeriodEnablePooling;

  @BuiltValueField(wireName: r'jasper.ieClassId')
  ConfigNodePropertyString? get jasperPeriodIeClassId;

  @BuiltValueField(wireName: r'jasper.genStringAsCharArray')
  ConfigNodePropertyBoolean? get jasperPeriodGenStringAsCharArray;

  @BuiltValueField(wireName: r'jasper.keepgenerated')
  ConfigNodePropertyBoolean? get jasperPeriodKeepgenerated;

  @BuiltValueField(wireName: r'jasper.mappedfile')
  ConfigNodePropertyBoolean? get jasperPeriodMappedfile;

  @BuiltValueField(wireName: r'jasper.trimSpaces')
  ConfigNodePropertyBoolean? get jasperPeriodTrimSpaces;

  @BuiltValueField(wireName: r'jasper.displaySourceFragments')
  ConfigNodePropertyBoolean? get jasperPeriodDisplaySourceFragments;

  @BuiltValueField(wireName: r'default.is.session')
  ConfigNodePropertyBoolean? get defaultPeriodIsPeriodSession;

  OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties._();

  factory OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties([void updates(OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder b)]) = _$OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties> get serializer => _$OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesSerializer();
}

class _$OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties, _$OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties];

  @override
  final String wireName = r'OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.jasperPeriodCompilerTargetVM != null) {
      yield r'jasper.compilerTargetVM';
      yield serializers.serialize(
        object.jasperPeriodCompilerTargetVM,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jasperPeriodCompilerSourceVM != null) {
      yield r'jasper.compilerSourceVM';
      yield serializers.serialize(
        object.jasperPeriodCompilerSourceVM,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jasperPeriodClassdebuginfo != null) {
      yield r'jasper.classdebuginfo';
      yield serializers.serialize(
        object.jasperPeriodClassdebuginfo,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.jasperPeriodEnablePooling != null) {
      yield r'jasper.enablePooling';
      yield serializers.serialize(
        object.jasperPeriodEnablePooling,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.jasperPeriodIeClassId != null) {
      yield r'jasper.ieClassId';
      yield serializers.serialize(
        object.jasperPeriodIeClassId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jasperPeriodGenStringAsCharArray != null) {
      yield r'jasper.genStringAsCharArray';
      yield serializers.serialize(
        object.jasperPeriodGenStringAsCharArray,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.jasperPeriodKeepgenerated != null) {
      yield r'jasper.keepgenerated';
      yield serializers.serialize(
        object.jasperPeriodKeepgenerated,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.jasperPeriodMappedfile != null) {
      yield r'jasper.mappedfile';
      yield serializers.serialize(
        object.jasperPeriodMappedfile,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.jasperPeriodTrimSpaces != null) {
      yield r'jasper.trimSpaces';
      yield serializers.serialize(
        object.jasperPeriodTrimSpaces,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.jasperPeriodDisplaySourceFragments != null) {
      yield r'jasper.displaySourceFragments';
      yield serializers.serialize(
        object.jasperPeriodDisplaySourceFragments,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.defaultPeriodIsPeriodSession != null) {
      yield r'default.is.session';
      yield serializers.serialize(
        object.defaultPeriodIsPeriodSession,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'jasper.compilerTargetVM':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jasperPeriodCompilerTargetVM.replace(valueDes);
          break;
        case r'jasper.compilerSourceVM':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jasperPeriodCompilerSourceVM.replace(valueDes);
          break;
        case r'jasper.classdebuginfo':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.jasperPeriodClassdebuginfo.replace(valueDes);
          break;
        case r'jasper.enablePooling':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.jasperPeriodEnablePooling.replace(valueDes);
          break;
        case r'jasper.ieClassId':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jasperPeriodIeClassId.replace(valueDes);
          break;
        case r'jasper.genStringAsCharArray':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.jasperPeriodGenStringAsCharArray.replace(valueDes);
          break;
        case r'jasper.keepgenerated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.jasperPeriodKeepgenerated.replace(valueDes);
          break;
        case r'jasper.mappedfile':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.jasperPeriodMappedfile.replace(valueDes);
          break;
        case r'jasper.trimSpaces':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.jasperPeriodTrimSpaces.replace(valueDes);
          break;
        case r'jasper.displaySourceFragments':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.jasperPeriodDisplaySourceFragments.replace(valueDes);
          break;
        case r'default.is.session':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.defaultPeriodIsPeriodSession.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder();
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

